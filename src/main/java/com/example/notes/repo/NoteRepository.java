package com.example.notes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.notes.entities.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {
	    
}
