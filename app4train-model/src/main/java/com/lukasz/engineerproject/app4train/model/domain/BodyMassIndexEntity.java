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
@Table(name = "BODY_MASS_INDEX")
@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class BodyMassIndexEntity {

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
	private UserEntity userEntity;

}
