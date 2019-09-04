package com.lukasz.engineerproject.app4train.model.domain;

import lombok.*;

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
@Table(name = "BASIC_METABOLIC_RATE")
@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class BasicMetabolicRateEntity {

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
	private UserEntity userEntity;

}
