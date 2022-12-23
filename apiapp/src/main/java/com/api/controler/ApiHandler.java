package com.api.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.model.Entries;
import com.api.model.EntryDto;
import com.api.service.EntriesService;

@RestController
@RequestMapping("/api/publicapis/org")
public class ApiHandler {
	
	@Autowired
	private EntriesService service;
	
	
	@GetMapping("/category")
     public ResponseEntity<List<EntryDto>> displayEntriessByCategoryHandler(@RequestParam String categoryName) {
		
		List<EntryDto> list = service.displayEntriessByCategory(categoryName);
		
		return new ResponseEntity<>(list, HttpStatus.OK);
		
	}

	@PostMapping("/entry")
	public ResponseEntity<Entries> storeEntriesToDatabaseHandler(@RequestBody Entries entry) {
		
		Entries result = service.storeEntriesToDatabase(entry);
		
		return new ResponseEntity<Entries>(result, HttpStatus.CREATED);
		
	}
	
	

}
