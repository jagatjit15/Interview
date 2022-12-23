package com.api.service;

import java.util.List;


import com.api.model.Entries;
import com.api.model.EntryDto;

public interface EntriesService {
	
	
	
	public List<EntryDto> displayEntriessByCategory(String categoryName);
	
	public Entries storeEntriesToDatabase(Entries entry);

}
