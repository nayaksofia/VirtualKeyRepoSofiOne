package com.sofi.exception;

@SuppressWarnings("serial")
public class FileNameNotFoundException extends RuntimeException {

	public FileNameNotFoundException() {
		super();

	}

	public FileNameNotFoundException(String message) {
		super(message + "not found");
		
	}

	
}
