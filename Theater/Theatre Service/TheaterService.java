package com.xworkz_theater_service;

import java.util.List;

import com.Xworkz_Theater.TheaterDto;

public interface TheaterService {

	public boolean save(TheaterDto dto);
	
	public List<TheaterDto> read();
	
	public TheaterDto findByName(String name);
	
	
	
}
