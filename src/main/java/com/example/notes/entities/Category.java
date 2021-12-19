package com.example.notes.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Table(name = "categories")
public class Category {
	
	@Id
	@Column(name="category_id")
    private Integer category_id;
	
	@Column(name = "name")
    private String name;
	
	public Integer getCategory_id() {
		return category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [category_id=" + category_id + ", name=" + name + "]";
	}
	
}
