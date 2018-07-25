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
@Table(name = "BASICMETABOLICRATE")
public class BasicMetabolicRate {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "dry_muscle_weight")
	@NotNull(message = "Musisz podaæ such¹ wagê miêœni!")
	private Double dryMuscleWeight;

	@NotNull(message = "Musisz podaæ wzrost!")
	@Column(name = "user_growth")
	private Integer userGrowth;

	@Column(name = "body_mass_ratio_result ")
	private Double basicMetabolicRateResult;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	@NotNull(message = "U¿ytkownik musi byæ wybrany")
	private User user;

	public BasicMetabolicRate() {

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

	public Double getDryMuscleWeight() {
		return dryMuscleWeight;
	}

	public void setDryMuscleWeight(Double dryMuscleWeight) {
		this.dryMuscleWeight = dryMuscleWeight;
	}

	public Integer getUserGrowth() {
		return userGrowth;
	}

	public void setUserGrowth(Integer userGrowth) {
		this.userGrowth = userGrowth;
	}

	public Double getBasicMetabolicRateResult() {
		return basicMetabolicRateResult;
	}

	public void setBasicMetabolicRateResult(Double basicMetabolicRateResult) {
		this.basicMetabolicRateResult = basicMetabolicRateResult;
	}

	@Override
	public String toString() {
		return "BodyMassRatio [id=" + id + ", dryMuscleWeight=" + dryMuscleWeight + ", userGrowth=" + userGrowth
				+ ", bodyMassRatioResult=" + basicMetabolicRateResult + "]";
	}
}
