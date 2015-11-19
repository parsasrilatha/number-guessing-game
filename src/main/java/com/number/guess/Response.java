package com.number.guess;

/**
 * User response codes.
 * 
 * @author Srilatha
 *
 */
public enum Response {
	HIGHER("Higher"), LOWER("Lower"), YES("Yes"), END("End"), READY("Ready");
	final String respCode;

	private Response(String levelCode) {
		this.respCode = levelCode;
	}
}