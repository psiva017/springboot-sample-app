package com.springboot.exception;

public class ServiceException extends Exception {

	private static final long serialVersionUID = 1L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(String msg, Throwable exception) {
		super(msg, exception);
	}

	public ServiceException(Throwable exception) {
		super(exception);
	}

}
