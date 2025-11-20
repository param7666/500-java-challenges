package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Mobile Rental Platform – Availability Check

You have a list of devices with name, category, isAvailable, and rentPerDay.
Find only available devices in “Smartphone” category, sort by lowest rent, map to device names, remove duplicates, and return top 5 devices.

 */


public class MobileAvailibiltyCheck {

	public static void main(String[] args) {
		
		Device d1  = new Device("iPhone 14", "Smartphone", true, 500);
		Device d2  = new Device("Samsung S22", "Smartphone", false, 450);
		Device d3  = new Device("iPad Air", "Tablet", true, 600);
		Device d4  = new Device("Dell XPS 13", "Smartphone", true, 900);
		Device d5  = new Device("MacBook Pro", "Laptop", false, 1200);
		Device d6  = new Device("Sony A7 Camera", "Camera", true, 850);
		Device d7  = new Device("Canon 1500D", "Camera", true, 500);
		Device d8  = new Device("Apple Watch Series 8", "Wearable", false, 250);
		Device d9  = new Device("GoPro Hero 11", "Smartphone", true, 400);
		Device d10 = new Device("Lenovo ThinkPad", "Laptop", true, 750);

		List<Device> devices = Arrays.asList(
			    d1, d2, d3, d4, d5, d6, d7, d8, d9, d10
			);
		
		List<String> topFiveSmartphone=devices.stream()
				.filter(d->d.getCatefory().equals("Smartphone") && d.isAvailable()) // check availibilty and category
				.sorted(Comparator.comparingDouble(Device::getRentPerDay)) // sort by price
				.map(d->d.getName()) // collect names
				.distinct() // remove duplicate
				.limit(5) // only 5 names
				.collect(Collectors.toList()); // collect as list
		topFiveSmartphone.forEach(System.out::println); // print
		

	}
}


class Device {
	private String name;
	private String catefory;
	private boolean isAvailable;
	private double rentPerDay;
	
	
	public Device(String name, String catefory, boolean isAvailable, double rentPerDay) {
		this.name = name;
		this.catefory = catefory;
		this.isAvailable = isAvailable;
		this.rentPerDay = rentPerDay;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCatefory() {
		return catefory;
	}


	public void setCatefory(String catefory) {
		this.catefory = catefory;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


	public double getRentPerDay() {
		return rentPerDay;
	}


	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	
	
}