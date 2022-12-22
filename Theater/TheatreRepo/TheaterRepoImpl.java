package com.xworkz_theater_repo;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz_Theater.TheaterDto;

public class TheaterRepoImpl implements TheaterRepo {
	
	List<TheaterDto> list = new ArrayList<TheaterDto>();
	

	@Override
	public boolean save(TheaterDto theaterdto) {
		System.out.println("list");
		list.add(theaterdto);
		System.out.println("Saved to database");
		return false;
	}

	@Override
	public List<TheaterDto> read() {
		return list;
	}

	@Override
	public TheaterDto findByName(String name) {
		for(TheaterDto dto : list) {
		if(dto.getName().equals(name)) {
			System.out.println("name is fetched");
		}
		}
		return null;
	}

}
