package com.xworkz_theater_service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz_Theater.TheaterDto;
import com.xworkz_theater_repo.TheaterRepo;
import com.xworkz_theater_repo.TheaterRepoImpl;

public class TheaterServiceImpl implements TheaterService {
	 List<TheaterDto> list=new ArrayList<TheaterDto>();
	 TheaterRepo repo = new TheaterRepoImpl();
	 
	 public boolean save(TheaterDto theaterdto)
	 {
		 if(theaterdto!=null)
		 {
			 if (theaterdto.getName().length() >= 3)
				 System.out.println("its valid and sending to repo");
			     repo.save(theaterdto);
			     return true;
			 
			 }
		 
		 else {
	    System.out.println("its not valid to repo");
	    return false;
		 }
    
}

	@Override
	public List<TheaterDto> read() {
		System.out.println("Read the methods");
		return repo.read();
	}

	@Override
	public TheaterDto findByName(String name) {
		if(name != null) {
			if(name.length()>=3) {
				System.out.println("Theater name is valid");	
				return repo.findByName(name);
			}
		}
		return null;
	}

} 
	   