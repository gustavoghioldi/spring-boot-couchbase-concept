package com.example.documents;


import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import lombok.Data;

@Document
@Data
public class ExternalDocument {
	
	 @Id private String id;
	 @Field  private String firstName;
	 @Field	 private String lastName;
}
