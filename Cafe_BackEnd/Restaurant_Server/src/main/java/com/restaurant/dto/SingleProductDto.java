package com.restaurant.dto;

import lombok.Data;

//@Data
public class SingleProductDto {

    private ProductDto productDto;

	public SingleProductDto(ProductDto productDto) {
		super();
		this.productDto = productDto;
	}

	public SingleProductDto() {
		super();
	}

	public ProductDto getProductDto() {
		return productDto;
	}

	public void setProductDto(ProductDto productDto) {
		this.productDto = productDto;
	}

    
}
