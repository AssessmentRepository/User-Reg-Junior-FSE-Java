package com.userRegistrationJWT.service;

import com.userRegistrationJWT.model.TextStatus;

public interface TextStatusService {
	Boolean createMessage(TextStatus textStatus);
	TextStatus getMessageById(String userId);
	Boolean UpdateMessageById(TextStatus textStatus);
	Boolean deleteMessageById(String userId);
}
