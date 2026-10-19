package com.tka.oct_18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MovieBooking {
	public static void main(String[] args) {
		System.out.println("@@ Welcome to Movie Ticket Booking App @@");

		Scanner sc = new Scanner(System.in);

		List<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie(101, "Pushpa 2", "Action", 200));
		movieList.add(new Movie(102, "Sairat", "Romance", 150));
		movieList.add(new Movie(103, "KGF 2", "Action", 250));
		movieList.add(new Movie(104, "3 Idiots", "Comedy", 180));
		movieList.add(new Movie(105, "Dangal", "Drama", 160));
		movieList.add(new Movie(106, "Jawan", "Action", 220));
		movieList.add(new Movie(107, "Chhichhore", "Drama", 140));
		movieList.add(new Movie(108, "Stree 2", "Horror", 190));

		Customer c1 = new Customer(11, "Suyash", 909876544, "Pune");

		Map<Integer, Movie> movieMap = new HashMap<>();

		for (Movie m : movieList) {
			movieMap.put(m.getId(), m);
		}

		System.out.println("\n===== MOVIE LIST =====");

		for (Movie m : movieList) {
			System.out.println(m.getId() + " : " + m.getTitle() + " : " + m.getGenre() + " : Rs." + m.getPrice());
		}
		
		List<Movie> selectedMovies = new ArrayList<>();

		int totalSeats = 0;
		char next;

		do {
			System.out.print("\nEnter Movie ID: ");
			int movieId = sc.nextInt();

			Movie selectedMovie = movieMap.get(movieId);

			if (selectedMovie != null) {

				System.out.print("Enter number of seats: ");
				int seats = sc.nextInt();

				if (seats > 0) {

					for (int i = 0; i < seats; i++) {
						selectedMovies.add(selectedMovie);
					}

					totalSeats = totalSeats + seats;

					System.out.println("Movie tickets added.");

				} else {
					System.out.println("Invalid number of seats.");
				}

			} else {
				System.out.println("Invalid Movie ID.");
			}

			System.out.print("Do you want to book more? (y/n): ");
			next = sc.next().charAt(0);

		} while (next == 'y' || next == 'Y');

		double totalAmount = 0;

		for (Movie m : selectedMovies) {
			totalAmount = totalAmount + m.getPrice();
		}

		Ticket t1 = new Ticket();

		t1.setBookingId((int) (Math.random() * 1000) + 1);
		t1.setCustomer(c1);
		t1.setNumberOfSeats(totalSeats);
		t1.setTotalAmount(totalAmount);

		if (totalSeats > 0) {
			t1.setStatus("Confirmed");
		} else {
			t1.setStatus("Not Booked");
		}

		System.out.println("\n===== MOVIE TICKET BILL =====");

		System.out.println("Booking ID: " + t1.getBookingId());
		System.out.println("Customer ID: " + c1.getcId());
		System.out.println("Customer Name: " + c1.getcName());
		System.out.println("Mobile: " + c1.getMob());
		System.out.println("City: " + c1.getCity());

		System.out.println("\nSelected Movies:");

		for (Movie m : selectedMovies) {
			System.out.println(m.getTitle() + " - Rs." + m.getPrice());
			break;
		}

		System.out.println("-------------------------");
		System.out.println("Total Seats: " + t1.getNumberOfSeats());
		System.out.println("Total Amount: Rs." + t1.getTotalAmount());
		System.out.println("Booking Status: " + t1.getStatus());

		sc.close();
	}

}
