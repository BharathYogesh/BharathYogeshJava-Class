package com.xworkz_theater_repo;

import java.util.ArrayList;

import com.Xworkz_Theater.TheaterDto;

public class Theater_Rep_Impl implements Theater_Repo {

	ArrayList<TheaterDto> list= new ArrayList<TheaterDto>();
	public boolean save(TheaterDto theaterdto) {
		System.out.println(list);
		return true;
	}

	@Override
	public boolean read(TheaterDto theaterdto) {
		System.out.println(list);
		return true;
	}

}
