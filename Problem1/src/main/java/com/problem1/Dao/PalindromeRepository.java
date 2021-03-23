package com.problem1.Dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.problem1.model.PalindromeString;
@Repository
public interface PalindromeRepository extends JpaRepository<PalindromeString, Integer>{

	Optional<PalindromeString> findByName(String inputString);
	
}
