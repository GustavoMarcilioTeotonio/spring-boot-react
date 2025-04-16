package com.senai.springbootreact.services;

import com.senai.springbootreact.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {

    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category saveCategory(Category category);
    Category updateCategory(Category category);
    // Pode ser igual ao save
    void deleteCategory(Long id);

}
