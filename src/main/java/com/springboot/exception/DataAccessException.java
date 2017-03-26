package com.springboot.exception;

public class DataAccessException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DataAccessException(){
		super();
	}
	public DataAccessException(String message){
		super(message);
	}
	public DataAccessException(String msg, Throwable exception) {
	    super(msg, exception);
	  }

	  public DataAccessException(Throwable exception) {
	    super(exception);
	  }

}
