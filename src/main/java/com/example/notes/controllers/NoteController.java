package com.example.notes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.notes.dto.NoteDTO;
import com.example.notes.services.NoteService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class NoteController {
	
	private NoteService noteService;

	@Autowired
	public NoteController(NoteService noteService) {
		
		
		this.noteService = noteService;
	}
	
	@GetMapping("/notes")
	public Iterable<NoteDTO>findAllNotes(){
		return this.noteService.getAllNotes();
	}
	
	
	
	

}
