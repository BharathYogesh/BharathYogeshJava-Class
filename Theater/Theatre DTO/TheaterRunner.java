package com.Xworkz_Theater;

import java.util.ArrayList;
import java.util.List;

import com.xworkz_theater_service.TheaterServiceImpl;

public class TheaterRunner {
public static void main(String[] args) {
	TheaterServiceImpl service= new TheaterServiceImpl();

	TheaterDto shan= new TheaterDto();
	 shan.setName("shan");
	 shan.setLocation("ramanagara");
	 shan.setHasParking(false);
	 shan.setNoOfEntrance(2);
	 shan.setNoOfSeats(120);
	 shan.setNoOfFloors(3);
	 shan.setNoOfStores(12);
	 shan.setScreens("two");
	 shan.setShowTimings("8.30 -12.30");
	 shan.setTimings("last 12.00");
       
     TheaterDto shan1= new TheaterDto();
     shan.setName("shan1");
     shan.setLocation("ramanagara");
     shan.setHasParking(false);
     shan.setNoOfEntrance(2);
     shan.setNoOfSeats(120);
     shan.setNoOfFloors(3);
     shan.setNoOfStores(12);
     shan.setScreens("two");
     shan.setShowTimings("8.30 -12.30");
     shan.setTimings("last 12.00");
     
     TheaterDto urvashi= new TheaterDto();
     urvashi.setName("urvashi");
     urvashi.setLocation("ramanagara");
     urvashi.setHasParking(false);
     urvashi.setNoOfEntrance(2);
     urvashi.setNoOfSeats(120);
     urvashi.setNoOfFloors(3);
     urvashi.setNoOfStores(12);
     urvashi.setScreens("two");
     urvashi.setShowTimings("8.30 -12.30");
     urvashi.setTimings("last 12.00");
     
     
     TheaterDto nartaki =new TheaterDto();
     nartaki.setName("nartaki");
     nartaki.setLocation("ramanagara");
     nartaki.setHasParking(false);
     nartaki.setNoOfEntrance(2);
     nartaki.setNoOfSeats(120);
     nartaki.setNoOfFloors(3);
     nartaki.setNoOfStores(12);
     nartaki.setScreens("two");
     nartaki.setShowTimings("8.30 -12.30");
     nartaki.setTimings("last 12.00");
     
     TheaterDto bhagya=new TheaterDto();
     bhagya.setName("bhagya");
     bhagya.setLocation("kanakapura");
     bhagya.setHasParking(false);
     bhagya.setNoOfEntrance(2);
     bhagya.setNoOfSeats(120);
     bhagya.setNoOfFloors(3);
     bhagya.setNoOfStores(12);
     bhagya.setScreens("two");
     bhagya.setShowTimings("8.30 -12.30");
     bhagya.setTimings("last 12.00");
     
     TheaterDto murthy=new TheaterDto();
     murthy.setName("murthy");
     murthy.setLocation("maddur");
     murthy.setHasParking(false);
     murthy.setNoOfEntrance(2);
     murthy.setNoOfSeats(120);
     murthy.setNoOfFloors(3);
     murthy.setNoOfStores(12);
     murthy.setScreens("two");
     murthy.setShowTimings("8.30 -12.30");
     murthy.setTimings("last 12.00");

TheaterDto bharath = new TheaterDto("bharath","banglore", 152,"9.30AM-12.00AM",true,"3shows",4,12,3,"twoScreens");
TheaterDto pvr = new TheaterDto("pvr","mysore", 252,"9.30AM-12.00AM",true,"3shows",4,12,3,"twoScreens");
TheaterDto inox = new TheaterDto("inox","maddur", 162,"9.30AM-12.00AM",true,"3shows",2,18,3,"twoScreens");
TheaterDto cpv = new TheaterDto("cpv","mandya", 85,"9.30AM-12.00AM",true,"3shows",3,12,3,"3Screens");
TheaterDto raj = new TheaterDto("raj","banglore", 59,"9.30AM-12.00AM",true,"3shows",4,12,3,"2Screens");
TheaterDto navaranga = new TheaterDto("rajajinagara","banglore", 52,"9.30AM-12.00AM",true,"3shows",4,8,3,"twoScreens");
TheaterDto gopalan = new TheaterDto("gopalan","beedar", 352,"9.30AM-12.00AM",true,"3shows",1,16,3,"twoScreens");
TheaterDto orionpvr = new TheaterDto("orionpvr","manglore", 252,"9.30AM-12.00AM",true,"3shows",4,12,3,"3Screens");
TheaterDto express = new TheaterDto("express","kanakapura", 152,"9.30AM-12.00AM",true,"3shows",5,12,3,"twoScreens");

service.save(express);
service.save(orionpvr);
service.save(gopalan);
service.save(navaranga);
service.save(bharath);
service.save(pvr);
service.save(inox);
service.save(shan);
service.save(murthy);
service.save(bhagya);
service.save(cpv);
service.save(raj);
service.save(nartaki);
service.save(urvashi);
service.save(shan);


List<TheaterDto> list=new ArrayList<TheaterDto>();
list.add(express);
list.add(express);
list.add(orionpvr);
list.add(gopalan);
list.add(navaranga);
list.add(bharath);
list.add(pvr);
list.add(inox);
list.add(shan);
list.add(murthy);
list.add(bhagya);
list.add(cpv);
list.add(raj);
list.add(nartaki);
list.add(urvashi);

System.out.println(list.add(shan));

boolean theaterList=service.read(gopalan);
System.out.println(theaterList);
}
}

