package com.example.notes.entities;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "notes")
public class Note {
	
    @Id
    @Column(name="note_id")
    private Integer note_id;

    @Column(name = "body")
    private String body;
    
    @Column(name = "category_id")
    private Integer category_id;


	
	

	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getNote_id() {
		return note_id;
	}

	public void setNote_id(Integer note_id) {
		this.note_id = note_id;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Integer getCategory_id() {
		return this.category_id;
	}

	public void setCategory_id(Integer category_id) {
		this.category_id = category_id;
	}
    
    
    

}
