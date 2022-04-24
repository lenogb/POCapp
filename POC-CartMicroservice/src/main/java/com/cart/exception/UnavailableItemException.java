package com.cart.exception;

import com.cart.enums.RequestError;

import lombok.Getter;

@SuppressWarnings("serial")
@Getter
public class UnavailableItemException extends RuntimeException{

	private final RequestError errorfound;
		
	public UnavailableItemException(RequestError errorfound,Object debugmessage) {
		super((String) debugmessage);
		this.errorfound=errorfound;
	}
}
