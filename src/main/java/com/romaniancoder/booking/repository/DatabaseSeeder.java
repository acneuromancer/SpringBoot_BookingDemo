package com.romaniancoder.booking.repository;

import com.romaniancoder.booking.domain.HotelBooking;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author corto
 */
@Component
public class DatabaseSeeder implements CommandLineRunner {
    
    private HotelBookingRepository repo;

    @Autowired
    public DatabaseSeeder(HotelBookingRepository repo) {
        this.repo = repo;
    }
    
    @Override
    public void run(String[] strings) throws Exception {
        List<HotelBooking> bookings = new ArrayList<>();
        bookings.add(new HotelBooking("Marriot", 200.50, 3));
        bookings.add(new HotelBooking("Ibis", 90.0, 4));
        bookings.add(new HotelBooking("Novotel", 140.74, 1));
        bookings.add(new HotelBooking("Four Seasons", 500.1, 4));
        bookings.add(new HotelBooking("Best", 100.0, 7));
        bookings.add(new HotelBooking("Capsule", 99.99, 10));
        System.out.println("Added 3 new HotelBooking");
        repo.saveAll(bookings);
        System.out.println("Saved to database.");
    }
    
}
