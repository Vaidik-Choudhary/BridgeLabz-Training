package com.vaidik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaidik.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}