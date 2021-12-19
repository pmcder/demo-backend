package com.example.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.notes.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
