package com.vaidik.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;
import com.vaidik.entity.Contact;
import com.vaidik.exception.ContactNotFoundException;
import com.vaidik.mapper.ContactMapper;
import com.vaidik.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactServiceImpl(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    @Override
    public ContactResponseDTO createContact(ContactRequestDTO request) {

        Contact contact = contactMapper.toEntity(request);

        Contact savedContact = contactRepository.save(contact);

        return contactMapper.toResponseDTO(savedContact);
    }

    @Override
    public List<ContactResponseDTO> getAllContacts() {

        return contactRepository.findAll()
                .stream()
                .map(contactMapper::toResponseDTO)
                .toList();
    }

    @Override
    public ContactResponseDTO getContactById(Long id) {

        Contact contact = contactRepository.findById(id)
        		.orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        return contactMapper.toResponseDTO(contact);
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

        return contactMapper.toResponseDTO(updatedContact);
    }

    @Override
    public void deleteContact(Long id) {

        Contact contact = contactRepository.findById(id)
        	    .orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

        contactRepository.delete(contact);
    }
    
    @Override
    public List<ContactResponseDTO> searchContacts(String name) {

        return contactRepository
                .findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase(name, name)
                .stream()
                .map(contactMapper::toResponseDTO)
                .toList();
    }
    
    @Override
    public void toggleFavorite(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new ContactNotFoundException("Contact not found with id: " + id));

       contact.setFavorite(!contact.isFavorite());

        contactRepository.save(contact);
    }
    
    @Override
    public List<ContactResponseDTO> getFavoriteContacts() {

        return contactRepository.findByFavoriteTrue()
                .stream()
                .map(contactMapper::toResponseDTO)
                .toList();
    }

}