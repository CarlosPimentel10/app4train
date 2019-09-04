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
@Table(name = "BODY_ADIPOSITY_INDEX")
@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class BodyAdiposityIndexEntity {

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
	private UserEntity userEntity;


}
