package com.userRegistrationJWT.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document("TextStatus")
@NoArgsConstructor
@AllArgsConstructor
public class TextStatus {
	@Id
	private String userId;
	private String textStatus;
}
