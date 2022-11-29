package com.anti.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.anti.controller.Library;

public interface LibaryRepository extends JpaRepository<Library, String> {

	
}
