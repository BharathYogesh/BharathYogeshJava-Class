package com.xworkz_theater_service;

import java.util.ArrayList;
import java.util.List;

import com.Xworkz_Theater.TheaterDto;
import com.xworkz_theater_repo.Theater_Rep_Impl;
import com.xworkz_theater_repo.Theater_Repo;



public class TheaterServiceImpl  implements TheaterService{
	
	Theater_Repo repo= new Theater_Rep_Impl();
	List<TheaterDto> dto=new ArrayList<TheaterDto>();
		
	@Override	public boolean save(TheaterDto theaterDTO) {
		if(dto!=null) {
			repo.save(theaterDTO);
			System.out.println("Dto is not null sending to repo");
			return true;
			}
			
			else {
			System.out.println("Dto is null");
			return false;

		
	}	
	}

	@Override
	public boolean read(TheaterDto theaterdtO) {
	
		return false;
	}
	}


	








