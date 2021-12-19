package com.example.notes.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;


@Entity
@Table(name = "categories")
public class Category {
	@Id
    private Integer category_id;
	
	@Column(name = "name", nullable = false)
    private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categories")
    private List<Note> notes;
	
	Category(String name){
		this.name = name;
		
	}

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
