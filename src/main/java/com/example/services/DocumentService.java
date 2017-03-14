package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.documents.ExternalDocument;
import com.example.repositories.DocumentRepository;

@Service
public class DocumentService{

	@Autowired
	public DocumentRepository documentRepository;
	
	
	public ExternalDocument findOne (String id) {
		return documentRepository.findOne(id);
	}
	
}
