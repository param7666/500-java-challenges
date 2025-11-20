package streamapi;

/*
7) Travel Booking – Cheapest Hotels

You have a list of hotels with name, city, price, and rating.
Filter hotels in Goa, rating >= 4, sort by price, and collect a list of hotel names.

 */

import java.util.*;

public class TravelBookingCheapest {

	public static void main(String[] args) {
		
		 List<Hotel> hotels = Arrays.asList(
	                new Hotel("Sea View Resort", "Goa", 2500, 4.5),
	                new Hotel("Palm Grove", "Goa", 1800, 4.2),
	                new Hotel("Beach Side Inn", "Goa", 3200, 4.8),
	                new Hotel("Goa Comfort Stay", "Goa", 1500, 4.0),
	                new Hotel("Sunshine Residency", "Goa", 2100, 4.3),
	                new Hotel("Ocean Bliss Hotel", "Goa", 2700, 4.6),
	                new Hotel("Riverfront Stay", "Goa", 1900, 4.1),

	                new Hotel("Royal Palace", "Mumbai", 4500, 4.5),
	                new Hotel("Skyline Hotel", "Delhi", 3800, 4.3),
	                new Hotel("Hilltop Resort", "Manali", 2900, 4.7),
	                new Hotel("Green Leaf Inn", "Pune", 2200, 4.2),
	                new Hotel("City Star Hotel", "Bangalore", 3300, 4.4),
	                new Hotel("Blue Lagoon Resort", "Goa", 2600, 3.8), // rating < 4 (should not pick)
	                new Hotel("Sunburn Stay", "Goa", 2300, 4.4),
	                new Hotel("Paradise Residency", "Chennai", 3000, 4.6)
	        );
		 
		 hotels.stream().filter(h->h.getCity().equals("Goa")) // filter of city
		 .filter(h->h.getRating()>=4) // filter by rating
		 .sorted(Comparator.comparingDouble(Hotel::getPrice).reversed()) // sort based on price high price display 1st
		 .map(h->h.getName()) // collect names from object
		 .forEach(System.out::println); // print
	}
}



class Hotel {
    private String name;
    private String city;
    private double price;
    private double rating;

    public Hotel(String name, String city, double price, double rating) {
        this.name = name;
        this.city = city;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return name + " | " + city + " | ₹" + price + " | ⭐" + rating;
    }
}
