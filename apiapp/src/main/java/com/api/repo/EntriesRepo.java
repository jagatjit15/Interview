package com.api.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.model.Entries;

@Repository
public interface EntriesRepo extends JpaRepository<Entries, Integer>{

	public List<Entries> findByCategory(String category);
	
}
