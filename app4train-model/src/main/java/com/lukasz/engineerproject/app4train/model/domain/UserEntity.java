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

	@NotNull(message = "Musisz poda� imie!")
	@Column(name = "first_name")
	private String firstName;

	@NotNull(message = "Musisz poda� nazwisko!")
	@Column(name = "last_name")
	private String lastName;

	@NotNull(message = "Musisz poda� wiek!")
	@Min(value = 0, message = "Wiek nie mo�e by� mniejszy ni� 0")
	@Max(value = 100, message = "Wiek nie mo�e by� wi�kszy ni� 100")
	@Column(name = "age")
	private Integer age;

	@NotNull(message = "Musisz poda� p�e�!")
	@Column(name = "gender")
	private String gender;

}
