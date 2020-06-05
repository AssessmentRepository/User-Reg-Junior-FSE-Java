package com.userRegistrationJWT.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userRegistrationJWT.model.TextStatus;
import com.userRegistrationJWT.repo.TextStatusRepository;

@Service
public class TextStatusServiceImpl implements TextStatusService {
	@Autowired
	private TextStatusRepository textStatusRepository;

	@Override
	public Boolean createMessage(TextStatus textStatus) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TextStatus getMessageById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean UpdateMessageById(TextStatus textStatus) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean deleteMessageById(String userId) {
		// TODO Auto-generated method stub
		return false;
	}


}
