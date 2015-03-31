package com.cm.domain.user;

public enum UserType {

	PAID(1), FREE(2);
	
	private int value;
	
	private UserType(int value){
		this.value = value;
	}
}
