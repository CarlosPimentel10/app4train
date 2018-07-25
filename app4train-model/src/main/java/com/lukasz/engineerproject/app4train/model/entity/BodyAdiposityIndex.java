package com.lukasz.engineerproject.app4train.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "BODYADIPOSITYINDEX")
public class BodyAdiposityIndex {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "hip_circumference")
	@NotNull(message = "Musisz podaæ obwód bioder!")
	private Double hipCircumference;

	@Column(name = "user_growth")
	@NotNull(message = "Musisz podaæ wzrost!")
	private Integer userGrowth;

	@Column(name = "body_adiposity_index_result ")
	private Double bodyAdiposityIndexResult;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@NotNull(message = "U¿ytkownik musi byæ wybrany")
	private User user;

	public BodyAdiposityIndex() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getHipCircumference() {
		return hipCircumference;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setHipCircumference(Double hipCircumference) {
		this.hipCircumference = hipCircumference;
	}

	public Integer getUserGrowth() {
		return userGrowth;
	}

	public void setUserGrowth(Integer userGrowth) {
		this.userGrowth = userGrowth;
	}

	public Double getBodyAdiposityIndexResult() {
		return bodyAdiposityIndexResult;
	}

	public void setBodyAdiposityIndexResult(Double bodyAdiposityIndexResult) {
		this.bodyAdiposityIndexResult = bodyAdiposityIndexResult;
	}

	@Override
	public String toString() {
		return "BodyAdiposityIndex [id=" + id + ", hipCircumference=" + hipCircumference + ", userGrowth=" + userGrowth
				+ ", bodyAdiposityIndexResult=" + bodyAdiposityIndexResult + "]";
	}
}
