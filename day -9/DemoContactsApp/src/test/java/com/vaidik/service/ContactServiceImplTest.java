package com.vaidik.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;
import com.vaidik.entity.Contact;
import com.vaidik.exception.ContactNotFoundException;
import com.vaidik.mapper.ContactMapper;
import com.vaidik.repository.ContactRepository;

@ExtendWith(MockitoExtension.class)
public class ContactServiceImplTest {

    @Mock
    private ContactRepository contactRepository;

    @Mock
    private ContactMapper contactMapper;

    @InjectMocks
    private ContactServiceImpl contactService;


    @Test
    void shouldCreateContact() {

        ContactRequestDTO request = new ContactRequestDTO("Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210");
        Contact contact = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        ContactResponseDTO response = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);

        when(contactMapper.toEntity(request)).thenReturn(contact);
        when(contactRepository.save(any(Contact.class))).thenReturn(contact);
        when(contactMapper.toResponseDTO(contact)).thenReturn(response);

        ContactResponseDTO result = contactService.createContact(request);

        assertEquals(1L, result.getId());
        assertEquals("Vaidik", result.getFirstName());
        assertEquals("Choudhary", result.getLastName());
        assertEquals("vaidik@example.com", result.getEmail());
        assertEquals("9039311323", result.getPhone());
        assertEquals("9876543210", result.getAlternatePhone());
        assertEquals(false, result.isFavorite());

        verify(contactMapper).toEntity(request);
        verify(contactRepository).save(contact);
        verify(contactMapper).toResponseDTO(contact);
    }


    @Test
    void shouldGetAllContacts() {

        Contact contact1 = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        Contact contact2 = new Contact(2L, "Rahul", "Sharma", "rahul@example.com", "9999999999", "8888888888", false);

        ContactResponseDTO response1 = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        ContactResponseDTO response2 = new ContactResponseDTO(2L, "Rahul", "Sharma", "rahul@example.com", "9999999999", "8888888888", false);

        when(contactRepository.findAll()).thenReturn(Arrays.asList(contact1, contact2));
        when(contactMapper.toResponseDTO(contact1)).thenReturn(response1);
        when(contactMapper.toResponseDTO(contact2)).thenReturn(response2);

        var contacts = contactService.getAllContacts();

        assertEquals(2, contacts.size());
        assertEquals("Vaidik", contacts.get(0).getFirstName());
        assertEquals("Rahul", contacts.get(1).getFirstName());

        verify(contactRepository).findAll();
        verify(contactMapper).toResponseDTO(contact1);
        verify(contactMapper).toResponseDTO(contact2);
    }


    @Test
    void shouldGetContactById() {

        Contact contact = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        ContactResponseDTO response = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);

        when(contactRepository.findById(1L)).thenReturn(Optional.of(contact));
        when(contactMapper.toResponseDTO(contact)).thenReturn(response);

        ContactResponseDTO result = contactService.getContactById(1L);

        assertEquals(1L, result.getId());
        assertEquals("Vaidik", result.getFirstName());
        assertEquals("Choudhary", result.getLastName());

        verify(contactRepository).findById(1L);
        verify(contactMapper).toResponseDTO(contact);
    }


    @Test
    void shouldThrowExceptionWhenContactNotFound() {

        when(contactRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ContactNotFoundException.class, () -> contactService.getContactById(99L));

        verify(contactRepository).findById(99L);
    }


    @Test
    void shouldUpdateContact() {

        Contact existingContact = new Contact(1L, "Vaidik", "Choudhary", "old@example.com", "1111111111", "2222222222", false);
        ContactRequestDTO request = new ContactRequestDTO("Vaidik", "Choudhary", "new@example.com", "9999999999", "8888888888");
        ContactResponseDTO response = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "new@example.com", "9999999999", "8888888888", false);

        when(contactRepository.findById(1L)).thenReturn(Optional.of(existingContact));
        when(contactRepository.save(any(Contact.class))).thenReturn(existingContact);
        when(contactMapper.toResponseDTO(existingContact)).thenReturn(response);

        ContactResponseDTO result = contactService.updateContact(1L, request);

        assertEquals("Vaidik", result.getFirstName());
        assertEquals("Choudhary", result.getLastName());
        assertEquals("new@example.com", result.getEmail());
        assertEquals("9999999999", result.getPhone());
        assertEquals("8888888888", result.getAlternatePhone());

        verify(contactRepository).findById(1L);
        verify(contactRepository).save(existingContact);
        verify(contactMapper).toResponseDTO(existingContact);
    }


    @Test
    void shouldDeleteContact() {

        Contact contact = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);

        when(contactRepository.findById(1L)).thenReturn(Optional.of(contact));

        contactService.deleteContact(1L);

        verify(contactRepository).findById(1L);
        verify(contactRepository).delete(contact);
    }


    @Test
    void shouldThrowExceptionWhenDeletingNonExistingContact() {

        when(contactRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ContactNotFoundException.class, () -> contactService.deleteContact(99L));

        verify(contactRepository).findById(99L);
    }


    @Test
    void shouldSearchContacts() {

        Contact contact1 = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        Contact contact2 = new Contact(2L, "Rahul", "Vaidik", "rahul@example.com", "9999999999", "8888888888", false);

        ContactResponseDTO response1 = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        ContactResponseDTO response2 = new ContactResponseDTO(2L, "Rahul", "Vaidik", "rahul@example.com", "9999999999", "8888888888", false);

        when(contactRepository.findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase("Vaidik", "Vaidik")).thenReturn(Arrays.asList(contact1, contact2));
        when(contactMapper.toResponseDTO(contact1)).thenReturn(response1);
        when(contactMapper.toResponseDTO(contact2)).thenReturn(response2);

        var contacts = contactService.searchContacts("Vaidik");

        assertEquals(2, contacts.size());
        assertEquals("Vaidik", contacts.get(0).getFirstName());
        assertEquals("Vaidik", contacts.get(1).getLastName());

        verify(contactRepository).findByFirstNameContainingIgnoreCaseOrLastNameContainingIgnoreCase("Vaidik", "Vaidik");
        verify(contactMapper).toResponseDTO(contact1);
        verify(contactMapper).toResponseDTO(contact2);
    }


    @Test
    void shouldToggleFavorite() {

        Contact contact = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);

        when(contactRepository.findById(1L)).thenReturn(Optional.of(contact));
        when(contactRepository.save(contact)).thenReturn(contact);

        contactService.toggleFavorite(1L);

        assertEquals(true, contact.isFavorite());

        verify(contactRepository).findById(1L);
        verify(contactRepository).save(contact);
    }


    @Test
    void shouldGetFavoriteContacts() {

        Contact contact1 = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", false);
        contact1.setFavorite(true);

        ContactResponseDTO response1 = new ContactResponseDTO(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210", true);

        when(contactRepository.findByFavoriteTrue()).thenReturn(Arrays.asList(contact1));
        when(contactMapper.toResponseDTO(contact1)).thenReturn(response1);

        var contacts = contactService.getFavoriteContacts();

        assertEquals(1, contacts.size());
        assertEquals("Vaidik", contacts.get(0).getFirstName());
        assertEquals(true, contacts.get(0).isFavorite());

        verify(contactRepository).findByFavoriteTrue();
        verify(contactMapper).toResponseDTO(contact1);
    }


    @Test
    void shouldThrowExceptionWhenTogglingFavoriteForNonExistingContact() {

        when(contactRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ContactNotFoundException.class, () -> contactService.toggleFavorite(99L));

        verify(contactRepository).findById(99L);
    }
}