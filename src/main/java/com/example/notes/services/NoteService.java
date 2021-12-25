package com.example.notes.services;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.notes.dto.NoteDTO;
import com.example.notes.entities.Note;
import com.example.notes.repo.CategoryRepository;
import com.example.notes.repo.NoteRepository;


@Service
public class NoteService {
	
	
	private NoteRepository noteRepository;
	
	private CategoryRepository categoriesRepository;
	
	private static final Logger logger = LogManager.getLogger(NoteService.class);
	
	@Autowired
	public NoteService(NoteRepository noteRepository, CategoryRepository categoriesRepository) {
		this.noteRepository = noteRepository;
		this.categoriesRepository = categoriesRepository;
	}
	
	public List<NoteDTO> getAllNotes(){
		
		//create an empty list
		List<NoteDTO> noteDTOList = new ArrayList<NoteDTO>();
		
		//get notes from the db -> create new array list so we have access to
		// parallel stream
		ArrayList<Note> noteList = new ArrayList<Note>(this.noteRepository.findAll());
		
		//for each note, get id and get category and populte into dto
		noteList.parallelStream().forEach(a->{
		//this line returns an optionsal so will have to be fixed as this will break
				String category = this.categoriesRepository.getById(a.getCategory_id()).getName();
				noteDTOList.add(new NoteDTO(a.getNote_id(), a.getBody(), category));
		});
				
		return noteDTOList;
		
	}
	
	
	

}
