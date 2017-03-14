package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.documents.ExternalDocument;
import com.example.repositories.DocumentRepository;

import java.util.Collection;
import java.util.UUID;

@RestController
public class Rest {
	
	@Autowired
	private DocumentRepository documentRepository;

	@RequestMapping(name="/api/document", method=RequestMethod.POST)
	public ExternalDocument insertExternalDocument(@RequestBody ExternalDocument externalDocument){
		externalDocument.setId(UUID.randomUUID().toString());		
		return documentRepository.save(externalDocument);
	}
	
	@RequestMapping(name="/api/document", method=RequestMethod.GET)
	public Collection<ExternalDocument> getAllExternalDocument(){
		return documentRepository.miMetodo();
	}
	
	
	
}