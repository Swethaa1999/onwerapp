package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Lead;

import antlr.collections.List;

public interface LeadRepository extends JpaRepository<Lead, Long> {
	
   // List<Lead> finByname(String str);

}
