package com.trungtamjava.exception;

public class ZeroException extends Exception {

	private String error;

	public ZeroException(String error) {
		super();
		this.error = error;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}
