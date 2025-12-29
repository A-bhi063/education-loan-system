package com.els.educationloansystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.els.educationloansystem.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
	
	

}
