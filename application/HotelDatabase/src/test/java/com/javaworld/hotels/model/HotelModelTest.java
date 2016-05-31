////////////////////////////////////////////////////////////////////////////////
// HotelModelTest: $Source$
// TODO Class summary goes here
//
// Created : 15 nov. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.javaworld.hotels.model;

import java.util.List;

import com.javaworld.hotels.businessobjects.Hotel;

import junit.framework.TestCase;

public class HotelModelTest extends TestCase {
	
	public void testFindHotelsByCity1() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.findHotelsByCity("Paris");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getCity(),"Paris");			
		}
	}
	
	public void testFindHotelsByCity2() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.findHotelsByCity("London");
		assertTrue(hotels.size() > 0);
		for(Hotel h : hotels) {
			assertEquals(h.getCity(),"London");			
		}
	}

	public void testFindHotelsByEmptyCity() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.findHotelsByCity("");
		assertTrue(hotels.size() == 0);
	}

	public void testFindHotelsByNullCity() {
		HotelModel finder = new HotelModel();
		List<Hotel> hotels = finder.findHotelsByCity(null);
		assertTrue(hotels.size() == 0);
	}

	public void testFindAvaliableCities() {
		HotelModel finder = new HotelModel();
		String[] cities = finder.findAvailableCities();
		assertEquals(cities.length, 2);
	}
	
}
