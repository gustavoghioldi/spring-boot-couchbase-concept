package com.example.controllers;

import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.documents.ExternalDocument;
import com.example.repositories.DocumentRepository;
import com.example.services.DocumentService;

@RestController
public class Rest {

	@Autowired
	private DocumentRepository documentRepository;

	
	@Autowired
	private DocumentService documentService;
	
	@RequestMapping(path = "/api/document", method = RequestMethod.POST)
	public ExternalDocument insertExternalDocument(@RequestBody ExternalDocument externalDocument) {
		externalDocument.setId(UUID.randomUUID().toString());
		ExternalDocument ex = documentRepository.save(externalDocument);
		System.out.println(ex);
		return documentRepository.save(externalDocument);
	}

	@RequestMapping(path = "/api/document", method = RequestMethod.GET)
	public Collection<ExternalDocument> getAllExternalDocument() {
		return documentRepository.miMetodo();
	}

	@GetMapping("/all")
	public ResponseEntity<?> prueba() {
		return new ResponseEntity<Iterable<ExternalDocument>>(documentRepository.findAll(), HttpStatus.OK);
	}

	@GetMapping("/one/{id}")
	public ResponseEntity<?> miRta(@PathVariable("id") String id) {
		if ("ar".equals(id)) {
			return new ResponseEntity<String>("Hola", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ExternalDocument>(documentService.findOne(id), HttpStatus.CREATED);
	}


}