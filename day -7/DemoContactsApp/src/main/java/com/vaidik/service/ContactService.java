package com.vaidik.service;

import java.util.List;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;

public interface ContactService {

    ContactResponseDTO createContact(ContactRequestDTO request);

    List<ContactResponseDTO> getAllContacts();

    ContactResponseDTO getContactById(Long id);

    ContactResponseDTO updateContact(Long id, ContactRequestDTO request);

    void deleteContact(Long id);
}