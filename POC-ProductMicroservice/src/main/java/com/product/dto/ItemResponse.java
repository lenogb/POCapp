package com.product.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ItemResponse {

    private Long itemId;
	private String productCode;	
	private String productName;
	private Double productPrice;
	private Long quantity;
	private Double subTotal;
	
	@Override
	public String toString() {
		return "(itemId=" + itemId + ", productCode=" + productCode + ", productName=" + productName
				+ ", productPrice=" + productPrice + ", quantity=" + quantity + ", subTotal=" + subTotal+")";
	}
}
