package com.lukasz.engineerproject.app4train.model.entity;

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
public class User {

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

	public User() {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.firstName + "-" + this.lastName + "-" + this.age;
	}
}
