package com.guvi.busBooking.helper;

import com.guvi.busBooking.model.Bookings;
import com.guvi.busBooking.model.BusData;
import com.guvi.busBooking.DTO.BookingsDTO;

public class ObjectCreationHelper {
	
	public static  BookingsDTO createBookingsDTO(BusData busdata) {
		BookingsDTO bks = new BookingsDTO();
		
		bks.setBusName(busdata.getBusName());
		bks.setFilterDate(busdata.getFilterDate());
		bks.setFromDestination(busdata.getFromDestination());
		bks.setToDestination(busdata.getToDestination());
		bks.setPrice(busdata.getPrice());
		bks.setNoOfPersons(0);
		bks.setTime(busdata.getTime());
		bks.setTotalCalculated(0.0);
		
		return bks;
		
	
	}

	public static BookingsDTO createBookingsDTO(Bookings busdata) {
BookingsDTO bks = new BookingsDTO();
bks.setId(busdata.getId());
		
		bks.setBusName(busdata.getBusName());
		bks.setFilterDate(busdata.getFilterDate());
		bks.setFromDestination(busdata.getFromDestination());
		bks.setToDestination(busdata.getToDestination());
		bks.setNoOfPersons(busdata.getNoOfPersons());
		bks.setTime(busdata.getTime());
		bks.setTotalCalculated(busdata.getTotalCalculated());
		if(busdata.isTripStatus()==true) {
			bks.setTripStatus("Active");
		}else {
			bks.setTripStatus("Canceled");
		}
		
		return bks;
	}

}
