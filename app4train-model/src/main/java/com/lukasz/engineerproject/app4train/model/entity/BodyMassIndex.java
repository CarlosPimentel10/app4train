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
@Table(name = "BODYMASSINDEX")
public class BodyMassIndex {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "user_weight")
	@NotNull(message = "Musisz podaæ wage!")

	private Double userWeight;
	@Column(name = "user_growth")
	@NotNull(message = "Musisz podaæ wzrost!")
	private Integer userGrowth;

	@Column(name = "body_mass_index_result ")
	private Double bodyMassIndexResult;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@NotNull(message = "U¿ytkownik musi byæ wybrany")
	private User user;

	public BodyMassIndex() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Double getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(Double userWeight) {
		this.userWeight = userWeight;
	}

	public Integer getUserGrowth() {
		return userGrowth;
	}

	public void setUserGrowth(Integer userGrowth) {
		this.userGrowth = userGrowth;
	}

	public Double getBodyMassIndexResult() {
		return bodyMassIndexResult;
	}

	public void setBodyMassIndexResult(Double bodyMassIndexResult) {
		this.bodyMassIndexResult = bodyMassIndexResult;
	}

	@Override
	public String toString() {
		return "BodyMassIndex [id=" + id + ", userWeight=" + userWeight + ", userGrowth=" + userGrowth
				+ ", bodyMassIndexResult=" + bodyMassIndexResult + "]";
	}
}
