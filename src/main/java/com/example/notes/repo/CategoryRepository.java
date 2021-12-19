package com.example.notes.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.notes.entities.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
