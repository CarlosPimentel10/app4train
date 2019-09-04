package com.lukasz.engineerproject.app4train.utils;

public enum Gender {

	MALE("Mê¿czyzna"),
	FEMALE("Kobieta");

	private final String string;

	Gender(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}
}
