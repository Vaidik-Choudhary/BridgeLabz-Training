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
import com.vaidik.repository.ContactRepository;

@ExtendWith(MockitoExtension.class)
public class ContactServiceImplTest {

    @Mock
    private ContactRepository contactRepository;

    @InjectMocks
    private ContactServiceImpl contactService;

    @Test
    void shouldCreateContact() {

        ContactRequestDTO request = new ContactRequestDTO("Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210");

        Contact contact = new Contact(1L, "Vaidik", "Choudhary", "vaidik@example.com", "9039311323", "9876543210");

        when(contactRepository.save(any(Contact.class))).thenReturn(contact);

        ContactResponseDTO response = contactService.createContact(request);

        assertEquals(1L, response.getId());
        assertEquals("Vaidik", response.getFirstName());
        assertEquals("Choudhary", response.getLastName());
        assertEquals("vaidik@example.com", response.getEmail());
        assertEquals("9039311323", response.getPhone());
        assertEquals("9876543210", response.getAlternatePhone());

        verify(contactRepository).save(any(Contact.class));
    }


    @Test
    void shouldGetAllContacts() {

        Contact contact1 = new Contact(1L,"Vaidik","Choudhary","vaidik@example.com","9039311323","9876543210");

        Contact contact2 = new Contact(2L,"Rahul", "Sharma","rahul@example.com","9999999999", "8888888888"
        );

        when(contactRepository.findAll()).thenReturn(Arrays.asList(contact1, contact2));

        var contacts = contactService.getAllContacts();

        assertEquals(2, contacts.size());
        assertEquals("Vaidik", contacts.get(0).getFirstName());
        assertEquals("Rahul", contacts.get(1).getFirstName());

        verify(contactRepository).findAll();
    }


    @Test
    void shouldGetContactById() {

        Contact contact = new Contact(1L, "Vaidik","Choudhary","vaidik@example.com","9039311323","9876543210");

        when(contactRepository.findById(1L)).thenReturn(Optional.of(contact));

        ContactResponseDTO response = contactService.getContactById(1L);

        assertEquals(1L, response.getId());
        assertEquals("Vaidik", response.getFirstName());
        assertEquals("Choudhary", response.getLastName());

        verify(contactRepository).findById(1L);
    }


    @Test
    void shouldThrowExceptionWhenContactNotFound() {

        when(contactRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ContactNotFoundException.class,() -> contactService.getContactById(99L));

        verify(contactRepository).findById(99L);
    }


    @Test
    void shouldUpdateContact() {

        Contact existingContact = new Contact(1L,"Vaidik","Choudhary", "old@example.com","1111111111", "2222222222");

        ContactRequestDTO request = new ContactRequestDTO("Vaidik", "Choudhary", "new@example.com", "9999999999", "8888888888");

        when(contactRepository.findById(1L)).thenReturn(Optional.of(existingContact));

        when(contactRepository.save(any(Contact.class))).thenReturn(existingContact);

        ContactResponseDTO response = contactService.updateContact(1L, request);

        assertEquals("Vaidik", response.getFirstName());
        assertEquals("Choudhary", response.getLastName());
        assertEquals("new@example.com", response.getEmail());
        assertEquals("9999999999", response.getPhone());
        assertEquals("8888888888", response.getAlternatePhone());

        verify(contactRepository).findById(1L);
        verify(contactRepository).save(existingContact);
    }


    @Test
    void shouldDeleteContact() {

        Contact contact = new Contact(1L, "Vaidik","Choudhary", "vaidik@example.com", "9039311323", "9876543210");

        when(contactRepository.findById(1L)).thenReturn(Optional.of(contact));

        contactService.deleteContact(1L);

        verify(contactRepository).findById(1L);
        verify(contactRepository).delete(contact);
    }


    @Test
    void shouldThrowExceptionWhenDeletingNonExistingContact() {

        when(contactRepository.findById(99L)).thenReturn(Optional.empty());

        assertThrows(ContactNotFoundException.class,() -> contactService.deleteContact(99L));

        verify(contactRepository).findById(99L);
    }
}