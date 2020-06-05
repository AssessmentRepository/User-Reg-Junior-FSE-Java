package com.userRegistrationJWT.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
@ResponseStatus
public class BadRequestException extends RuntimeException 
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BadRequestException(String exception) {
        super(exception);
    }
	}