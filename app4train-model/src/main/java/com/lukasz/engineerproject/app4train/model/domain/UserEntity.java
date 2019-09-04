package com.lukasz.engineerproject.app4train.model.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER")
@Getter
@Setter
@Builder
@AllArgsConstructor(onConstructor = @__(@Builder))
@NoArgsConstructor
@ToString
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@NotNull(message = "Musisz podaæ imie!")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "Musisz podaæ nazwisko!")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "Musisz podaæ wiek!")
	@Min(value = 0, message = "Wiek nie mo¿e byæ mniejszy ni¿ 0")
	@Max(value = 100, message = "Wiek nie mo¿e byæ wiêkszy ni¿ 100")
	@Column(name = "age")
	private Integer age;

	@NotNull(message = "Musisz podaæ p³eæ!")
	@Column(name = "gender")
	private String gender;

}
