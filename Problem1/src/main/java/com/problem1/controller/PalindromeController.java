package com.problem1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.problem1.LongestPalindromeSubstring;
import com.problem1.Dao.PalindromeRepository;
import com.problem1.model.PalindromeString;

@RestController
public class PalindromeController {
	@Autowired
	private PalindromeRepository pr;

	
	@GetMapping("/{inputString}") 
	public PalindromeString getLongestPalindromicSubstring(@PathVariable String inputString) {
		Optional<PalindromeString> palinOptional = pr.findByName(inputString);
		if(palinOptional.isPresent()) {
			return palinOptional.get();
		}
		String longestPalindromeString = LongestPalindromeSubstring.longestPalindrome(inputString);
		PalindromeString ps = new PalindromeString(inputString, longestPalindromeString);
		pr.save(ps);
		return ps;
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public List<PalindromeString> viewAll() {
		
		return pr.findAll();
	}
}
