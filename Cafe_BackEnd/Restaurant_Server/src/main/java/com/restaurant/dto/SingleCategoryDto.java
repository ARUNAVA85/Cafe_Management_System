package com.restaurant.dto;

import lombok.Data;

//@Data
public class SingleCategoryDto {

    private CategoryDto categoryDto;

	public SingleCategoryDto(CategoryDto categoryDto) {
		super();
		this.categoryDto = categoryDto;
	}

	public SingleCategoryDto() {
		super();
	}

	public CategoryDto getCategoryDto() {
		return categoryDto;
	}

	public void setCategoryDto(CategoryDto categoryDto) {
		this.categoryDto = categoryDto;
	}
    
    
}
