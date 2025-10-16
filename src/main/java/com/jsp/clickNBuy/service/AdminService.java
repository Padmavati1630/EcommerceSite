package com.jsp.clickNBuy.service;

import com.jsp.clickNBuy.entity.Category;

import com.jsp.clickNBuy.dto.ResponseDto;

public interface AdminService {

	ResponseDto addCategory(Category category);

	ResponseDto viewCatogeries();

	ResponseDto deleteCategory(Long id);

	ResponseDto updateCategory(Long id, Category category);

	

}
