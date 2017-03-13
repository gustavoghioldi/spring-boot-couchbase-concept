package com.example.documents;

import org.springframework.data.couchbase.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class ExternalDocument {
	 private String firstName;
	 private String lastName;
}
