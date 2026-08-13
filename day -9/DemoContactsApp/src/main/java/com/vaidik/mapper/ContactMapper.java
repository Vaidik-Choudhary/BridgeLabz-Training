package com.vaidik.mapper;

import org.springframework.stereotype.Component;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;
import com.vaidik.entity.Contact;

@Component
public class ContactMapper {

    public Contact toEntity(ContactRequestDTO request) {

        Contact contact = new Contact();

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setAlternatePhone(request.getAlternatePhone());

        return contact;
    }

    public ContactResponseDTO toResponseDTO(Contact contact) {

        return new ContactResponseDTO(
                contact.getId(),
                contact.getFirstName(),
                contact.getLastName(),
                contact.getEmail(),
                contact.getPhone(),
                contact.getAlternatePhone(),
                contact.isFavorite()
        );
    }
}