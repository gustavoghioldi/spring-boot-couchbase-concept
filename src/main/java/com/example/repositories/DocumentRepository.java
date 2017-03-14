package com.example.repositories;

import java.util.Collection;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.example.documents.ExternalDocument;

@ViewIndexed(designDoc = "externalDocument", viewName = "all")
public interface DocumentRepository extends CouchbaseRepository<ExternalDocument, String> {
	
	@Query("SELECT firstName, lastName, META(`default`).id as _ID,  META(`default`).cas as _CAS from default")
	Collection<ExternalDocument> miMetodo();
}
