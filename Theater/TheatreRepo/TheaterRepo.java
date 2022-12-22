package com.xworkz_theater_repo;

import java.util.List;

import com.Xworkz_Theater.TheaterDto;

public interface TheaterRepo {

	public boolean save(TheaterDto theaterdto);

	public List<TheaterDto> read();

	public TheaterDto findByName(String name);
	
}
