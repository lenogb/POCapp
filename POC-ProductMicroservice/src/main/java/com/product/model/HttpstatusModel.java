package com.product.model;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.product.enums.Errors;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Component
public class HttpstatusModel {

	private HttpStatus apistatus;
	private Errors errorfound;
	private Object debugmessage;
		
	public HttpstatusModel(HttpStatus apistatus,Errors errorfound,Object debugmessage) {
		this.apistatus=apistatus;
		this.errorfound=errorfound;
		this.debugmessage=debugmessage;
	}
}
