package com.vaidik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vaidik.dto.ContactRequestDTO;
import com.vaidik.dto.ContactResponseDTO;
import com.vaidik.service.ContactService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
    	this.contactService = contactService;
    }

    // http://localhost:8080/swagger-ui/index.html#/
    
    // CREATE
    @PostMapping
    public ResponseEntity<ContactResponseDTO> createContact(@Valid @RequestBody ContactRequestDTO request) {

        ContactResponseDTO response = contactService.createContact(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    // SHOW ALL
    @GetMapping
    public ResponseEntity<List<ContactResponseDTO>> getAllContacts() {

        List<ContactResponseDTO> contacts = contactService.getAllContacts();

        return ResponseEntity.ok(contacts);
    }
    
    // SEARCH BY NAME
    @GetMapping("/search")
    public ResponseEntity<List<ContactResponseDTO>> searchContacts(@RequestParam String name) {

        List<ContactResponseDTO> contacts = contactService.searchContacts(name);

        return ResponseEntity.ok(contacts);
    }

    // SEARCH BY ID
    @GetMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> getContactById(@PathVariable Long id) {

        ContactResponseDTO response = contactService.getContactById(id);

        return ResponseEntity.ok(response);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<ContactResponseDTO> updateContact(@PathVariable Long id,@Valid @RequestBody ContactRequestDTO request) {

        ContactResponseDTO response = contactService.updateContact(id, request);

        return ResponseEntity.ok(response);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {

        contactService.deleteContact(id);

        return ResponseEntity.noContent().build();
    }
    
    // FAVORITE TOGGLE
    @PatchMapping("/{id}/favorite")
    public ResponseEntity<Void> toggleFavorite(@PathVariable Long id) {

        contactService.toggleFavorite(id);

        return ResponseEntity.noContent().build();
    }
    
    // FAVORITE LIST
    @GetMapping("/favorites")
    public ResponseEntity<List<ContactResponseDTO>> getFavoriteContacts() {

        List<ContactResponseDTO> contacts = contactService.getFavoriteContacts();

        return ResponseEntity.ok(contacts);
    }
    
}