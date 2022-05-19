package com.cartgateway.dtos;

import com.cartgateway.enums.Problem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

	private Object message;
	private Problem problem;
	
}
