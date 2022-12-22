package com.Xworkz_Theater;

import java.util.ArrayList;
import java.util.List;

import com.xworkz_theater_repo.TheaterRepo;
import com.xworkz_theater_repo.TheaterRepoImpl;
import com.xworkz_theater_service.TheaterService;
import com.xworkz_theater_service.TheaterServiceImpl;

public class TheaterRunner {
public static void main(String[] args) {
	
	
	TheaterService service = new TheaterServiceImpl();
	
	TheaterDto dto=new TheaterDto();
	dto.setName("Shan");
	dto.setLocation("Ramanagara");
	dto.setLifts(4);
	dto.setColour("blue");
	dto.setHasParking(false);
	dto.setNoOfEntrance(2);
	dto.setNoOfFloors(4);
	dto.setNoOfSeats(185);
	dto.setGuards(10);
	dto.setNoOfStores(5);
	dto.setSeatingPositions("goldclass");
	dto.setShowTimings("9.30-11.30pm");
	dto.setSpeakers("dolby");
	dto.setTimings("morning,Evening");
	dto.setScreen("3d");
	
	TheaterDto dto1=new TheaterDto();
	dto1.setName("Inox");
	dto1.setLocation("MysoreRoad");
	dto1.setLifts(4);
	dto1.setColour("blue");
	dto1.setHasParking(false);
	dto1.setNoOfEntrance(2);
	dto1.setNoOfFloors(4);
	dto1.setNoOfSeats(185);
	dto1.setGuards(10);
	dto1.setNoOfStores(5);
	dto1.setSeatingPositions("goldclass");
	dto1.setShowTimings("9.30-11.30pm");
	dto1.setSpeakers("dolby");
	dto1.setTimings("morning,Evening");
	dto1.setScreen("3d");
	
	TheaterDto dto2=new TheaterDto();
	dto2.setName("King");
	dto2.setLocation("Ramanagara");
	dto2.setLifts(4);
	dto2.setColour("blue");
	dto2.setHasParking(false);
	dto2.setNoOfEntrance(2);
	dto2.setNoOfFloors(4);
	dto2.setNoOfSeats(185);
	dto2.setGuards(10);
	dto2.setNoOfStores(5);
	dto2.setSeatingPositions("goldclass");
	dto2.setShowTimings("9.30-11.30pm");
	dto2.setSpeakers("dolby");
	dto2.setTimings("morning,Evening");
	dto2.setScreen("3d");
	
	TheaterDto dto3=new TheaterDto();
	dto3.setName("Cini");
	dto3.setLocation("kanakapura");
	dto3.setLifts(4);
	dto3.setColour("blue");
	dto3.setHasParking(false);
	dto3.setNoOfEntrance(2);
	dto3.setNoOfFloors(4);
	dto3.setNoOfSeats(185);
	dto3.setGuards(10);
	dto3.setNoOfStores(5);
	dto3.setSeatingPositions("goldclass");
	dto3.setShowTimings("9.30-11.30pm");
	dto3.setSpeakers("dolby");
	dto3.setTimings("morning,Evening");
	dto3.setScreen("3d");
	
	TheaterDto dto4=new TheaterDto();
	dto4.setName("Deepak");
	dto4.setLocation("Bidadi");
	dto4.setLifts(4);
	dto4.setColour("blue");
	dto4.setHasParking(false);
	dto4.setNoOfEntrance(2);
	dto4.setNoOfFloors(4);
	dto4.setNoOfSeats(185);
	dto4.setGuards(10);
	dto4.setNoOfStores(5);
	dto4.setSeatingPositions("goldclass");
	dto4.setShowTimings("9.30-11.30pm");
	dto4.setSpeakers("dolby");
	dto4.setTimings("morning,Evening");
	dto4.setScreen("3d");
	
	TheaterDto dto5=new TheaterDto();
	dto5.setName("Murthy");
	dto5.setLocation("Banglore");
	dto5.setLifts(4);
	dto5.setColour("blue");
	dto5.setHasParking(false);
	dto5.setNoOfEntrance(2);
	dto5.setNoOfFloors(4);
	dto5.setNoOfSeats(185);
	dto5.setGuards(10);
	dto5.setNoOfStores(5);
	dto5.setSeatingPositions("goldclass");
	dto5.setShowTimings("9.30-11.30pm");
	dto5.setSpeakers("dolby");
	dto5.setTimings("morning,Evening");
	dto5.setScreen("3d");
	
	
	TheaterDto dto6=new TheaterDto();
	dto6.setName("Bhgya");
	dto6.setLocation("Madduru");
	dto6.setLifts(4);
	dto6.setColour("red");
	dto6.setHasParking(false);
	dto6.setNoOfEntrance(2);
	dto6.setNoOfFloors(4);
	dto6.setNoOfSeats(185);
	dto6.setGuards(10);
	dto6.setNoOfStores(5);
	dto6.setSeatingPositions("goldclass");
	dto6.setShowTimings("9.30-10.30pm");
	dto6.setSpeakers("dolby");
	dto6.setTimings("morning,Evening");
	dto6.setScreen("2d");
	
	
	TheaterDto dto7=new TheaterDto();
	dto7.setName("Bharat");
	dto7.setLocation("annahalli");
	dto7.setLifts(4);
	dto7.setColour("blue");
	dto7.setHasParking(false);
	dto7.setNoOfEntrance(2);
	dto7.setNoOfFloors(4);
	dto7.setNoOfSeats(185);
	dto7.setGuards(10);
	dto7.setNoOfStores(5);
	dto7.setSeatingPositions("goldclass");
	dto7.setShowTimings("9.30-11.30pm");
	dto7.setSpeakers("dolby");
	dto7.setTimings("morning,Evening");
	dto7.setScreen("3d");
	
	TheaterDto dto8=new TheaterDto();
	dto8.setName("Polo");
	dto8.setLocation("Market");
	dto8.setLifts(4);
	dto8.setColour("blue");
	dto8.setHasParking(false);
	dto8.setNoOfEntrance(2);
	dto8.setNoOfFloors(4);
	dto8.setNoOfSeats(185);
	dto8.setGuards(10);
	dto8.setNoOfStores(5);
	dto8.setSeatingPositions("goldclass");
	dto8.setShowTimings("9.30-11.30pm");
	dto8.setSpeakers("dolby");
	dto8.setTimings("morning,Evening");
	dto8.setScreen("3d");
	
	
	TheaterDto dto9=new TheaterDto();
	dto9.setName("Yogesh");
	dto9.setLocation("Ballery");
	dto9.setLifts(4);
	dto9.setColour("blue");
	dto9.setHasParking(false);
	dto9.setNoOfEntrance(2);
	dto9.setNoOfFloors(4);
	dto9.setNoOfSeats(185);
	dto9.setGuards(10);
	dto9.setNoOfStores(5);
	dto9.setSeatingPositions("goldclass");
	dto9.setShowTimings("9.30-11.30pm");
	dto9.setSpeakers("dolby");
	dto9.setTimings("morning,Evening");
	dto9.setScreen("3d");
	
	TheaterDto dto10=new TheaterDto();
	dto10.setName("Prajwal");
	dto10.setLocation("Tumukr");
	dto10.setLifts(4);
	dto10.setColour("blue");
	dto10.setHasParking(false);
	dto10.setNoOfEntrance(2);
	dto10.setNoOfFloors(4);
	dto10.setNoOfSeats(185);
	dto10.setGuards(10);
	dto10.setNoOfStores(5);
	dto10.setSeatingPositions("goldclass");
	dto10.setShowTimings("9.30-11.30pm");
	dto10.setSpeakers("dolby");
	dto10.setTimings("morning,Evening");
	dto10.setScreen("3d");
	
	TheaterDto dto11= new TheaterDto();
	dto11.setName("Shivananda");
	dto11.setLocation("RR nagara");
	dto11.setLifts(4);
	dto11.setColour("blue");
	dto11.setHasParking(false);
	dto11.setNoOfEntrance(2);
	dto11.setNoOfFloors(4);
	dto11.setNoOfSeats(185);
	dto11.setGuards(10);
	dto11.setNoOfStores(5);
	dto11.setSeatingPositions("goldclass");
	dto11.setShowTimings("9.30-11.30pm");
	dto11.setSpeakers("dolby");
	dto11.setTimings("morning,Evening");
	dto11.setScreen("3d");
	
	
	TheaterDto dto12= new TheaterDto("Crc","crRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto13= new TheaterDto("jdk","mysoreRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto14= new TheaterDto("Balaji","guttulu",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto15= new TheaterDto("krishna","SPRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto16= new TheaterDto("Parvathi","JCRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto17= new TheaterDto("Vishnu","KnakapuraRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto18= new TheaterDto("Sujatha","MaddurRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto19= new TheaterDto("Urvashi","BallaryRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	TheaterDto dto20= new TheaterDto("Nartaki","BidadiRoad",12,"9.30am-12.30pm",false,"morningtoevening",4,12,3,5,"orange","dolby","goldclass",10,"3d");
	
	TheaterService services= new TheaterServiceImpl();
	services.save(dto);
	services.save(dto1);
	services.save(dto2);
	services.save(dto3);
	services.save(dto4);
	services.save(dto5);
	services.save(dto6);
	services.save(dto7);
	services.save(dto8);
	services.save(dto9);
	services.save(dto10);
	services.save(dto11);
	services.save(dto12);
	services.save(dto13);
	services.save(dto14);
	services.save(dto15);
	services.save(dto16);
	services.save(dto17);
	services.save(dto18);
	services.save(dto19);
	services.save(dto20);
	
	
	
	List<TheaterDto> list= new ArrayList<TheaterDto>();
	list.add(dto);
	list.add(dto1);
	list.add(dto2);
	list.add(dto3);
	list.add(dto4);
	list.add(dto5);
	list.add(dto6);
	list.add(dto7);
	list.add(dto8);
    list.add(dto9);
	list.add(dto10);
	list.add(dto11);
	list.add(dto12);
	list.add(dto13);
	list.add(dto14);
	list.add(dto15);
	list.add(dto16);
	list.add(dto17);
	list.add(dto18);
	list.add(dto19);
	list.add(dto20);
	
	
	TheaterRepo repo = new TheaterRepoImpl();
	repo.save(dto1);
	for(TheaterDto dtos : services.read() ) {
		System.out.println(dto1);
	
	
	}
System.out.println(services.findByName("inox"));
}
}
