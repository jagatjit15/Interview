package com.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.model.Entries;
import com.api.model.EntryDto;
import com.api.repo.EntriesRepo;


@Service
public class Implementation implements EntriesService{

	
	@Autowired
	private EntriesRepo repo;
	
	
	@Override
	public List<EntryDto> displayEntriessByCategory(String categoryName) {
		
		String[] s = categoryName.split(" ");
		
		List<Entries> listEntries = repo.findByCategory(s[0]);
		
		List<EntryDto> result = new ArrayList<>();
		
		for(Entries entry : listEntries) {
			EntryDto newData = new EntryDto(entry.getAPI(), entry.getCategory());
			result.add(newData);
		}
		
		return result;
	}

	@Override
	public Entries storeEntriesToDatabase(Entries entry) {
		
		
		return repo.save(entry);
		
		
	}

}
