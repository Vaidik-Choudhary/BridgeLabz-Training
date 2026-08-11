package com.vaidik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;
import com.vaidik.entity.Contact;
import com.vaidik.exception.ContactNotFoundException;
import com.vaidik.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactResponseDTO createContact(ContactRequestDTO request) {

        Contact contact = new Contact();

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setAlternatePhone(request.getAlternatePhone());

        Contact savedContact = contactRepository.save(contact);

        return convertToResponseDTO(savedContact);
    }

    @Override
    public List<ContactResponseDTO> getAllContacts() {

        return contactRepository.findAll()
                .stream()
                .map(this::convertToResponseDTO)
                .toList();
    }

    @Override
    public ContactResponseDTO getContactById(Long id) {

        Contact contact = contactRepository.findById(id)
        		.orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        return convertToResponseDTO(contact);
    }

    @Override
    public ContactResponseDTO updateContact(Long id, ContactRequestDTO request) {

        Contact contact = contactRepository.findById(id)
        		.orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());
        contact.setPhone(request.getPhone());
        contact.setAlternatePhone(request.getAlternatePhone());

        Contact updatedContact = contactRepository.save(contact);

        return convertToResponseDTO(updatedContact);
    }

    @Override
    public void deleteContact(Long id) {

        Contact contact = contactRepository.findById(id)
        	    .orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        contactRepository.delete(contact);
    }

    private ContactResponseDTO convertToResponseDTO(Contact contact) {

        return new ContactResponseDTO(
                contact.getId(),
                contact.getFirstName(),
                contact.getLastName(),
                contact.getEmail(),
                contact.getPhone(),
                contact.getAlternatePhone()
        );
    }
}