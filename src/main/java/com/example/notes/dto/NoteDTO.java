package com.example.notes.dto;

public class NoteDTO {
	
	private Integer note_id;
	
	private String body;
	
	private String category;

	public NoteDTO(Integer note_id, String body, String category) {
		super();
		this.note_id = note_id;
		this.body = body;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
