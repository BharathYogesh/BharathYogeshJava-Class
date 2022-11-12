package com.ObjClass.toString;

public class Education {
	String type;
	String branch;
	int years;


	public Education(String type,String branch,int years) {
		this.branch=branch;
		this.type=type;
	     this.years=years;
	}

	@Override

	public String toString()
	{
		return "Education[type="+type+", branch="+branch+",years="+years+"]";
	}
}
