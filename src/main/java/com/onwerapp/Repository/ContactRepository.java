package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Contacts;

public interface ContactRepository extends JpaRepository<Contacts, Long> {

}
