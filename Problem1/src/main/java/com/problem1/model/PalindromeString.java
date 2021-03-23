package com.problem1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@NoArgsConstructor
@Entity(name="palindrome")
@Data
public class PalindromeString {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String longestPalin;
	
	public PalindromeString() {
		super();
	}

	public PalindromeString(String input, String longest) {
		name = input;
		longestPalin = longest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLongestPalin() {
		return longestPalin;
	}

	public void setLongestPalin(String longestPalin) {
		this.longestPalin = longestPalin;
	}
}
