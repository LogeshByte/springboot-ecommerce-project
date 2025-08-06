package com.logesh.ecom_project.service;

import com.logesh.ecom_project.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
