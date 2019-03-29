package com.cg.capbook.exceptions;

import com.cg.capbook.beans.UserProfile;

public class EmailAlreadyExistException extends Exception {

	public EmailAlreadyExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyExistException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyExistException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public EmailAlreadyExistException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
