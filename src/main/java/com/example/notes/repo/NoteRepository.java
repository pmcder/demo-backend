package com.example.notes.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.notes.entities.Note;

public interface NoteRepository extends CrudRepository<Note, Integer> {
	    
}
