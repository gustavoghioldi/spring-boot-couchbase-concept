package com.example.models;

import com.example.documents.ExternalDocument;

import lombok.*;

@RequiredArgsConstructor
@ToString(exclude="id")
public class ExternalObject {

	@Getter @NonNull private long id;
	@Getter @Setter
	private ExternalDocument externalJson;
	
}
