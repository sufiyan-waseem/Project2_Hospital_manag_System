package org.project.domain;

public class HospException extends Exception {
	public String getMessage1() {
		String str = "No Data Found";
		return str;
	}
	public String getMessage2( ) {
		String str = "Enter Proper ID Starting with D";
		return str;
	}
}
