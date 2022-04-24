package com.cart.enums;

import lombok.Getter;

@Getter
public enum RequestError {
	//not found
	//conflict name
	//conflict code
	//out of stocks
	//exceed number of stocks

	NOTFOUND("Requesting for a product that could not be found"),
	NOSTOCKS("Requesting for a product that is Out of Stock"),
	QUANTITYEXCEEDED("The quantity specified exceeded the product's stock supply"),
	NULLFIELDS("Field should not be empty. Highly required."),
	UNACCEPTABLEINPUT("Unprocessable input"),
	OPERATIONFAILED("Database service failed"),
	UNASSOCIATEDACCOUNT("Account is not associated with the cart or vice versa"),
	ERROR(""), 
	UNAVAILABLE("Product is no longer available");
	
	private final String message;
	
	RequestError(String message){
		this.message=message;
	}
}
