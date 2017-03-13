package com.example.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.documents.ExternalDocument;
import com.example.models.ExternalObject;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class Rest {

	private final AtomicLong id = new AtomicLong();

	@RequestMapping(name="/api", method=RequestMethod.POST)
	public ExternalObject externalObject(@RequestBody ExternalDocument externalDocument){
		
		ExternalObject eo =  new ExternalObject(id.incrementAndGet());
		eo.setExternalJson(externalDocument);
		return eo;
	}
}