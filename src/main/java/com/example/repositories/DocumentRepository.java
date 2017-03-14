package com.example.repositories;

import org.springframework.data.couchbase.core.query.ViewIndexed;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import com.example.documents.ExternalDocument;

@ViewIndexed(designDoc = "externalDocument", viewName = "all")
public interface DocumentRepository extends CouchbaseRepository<ExternalDocument, String> {

}
