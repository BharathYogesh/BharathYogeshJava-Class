package com.Construcor_Paramaterized.Parameterized_Constructor;

public class College {

	String name;
	String course;
	double strengths;


	College(String name1,String course1,double strengths1) 
	{
	System.out.println("I am parameterized ");
	name=name1;
	course=course1;
	strengths=strengths1;

	}


	public static void main (String arg[])
	{
		College college = new College("VKIT","BE",5000);

		System.out.println(college.name);
		System.out.println(college.course);
		System.out.println(college.strengths);
	}
	}

