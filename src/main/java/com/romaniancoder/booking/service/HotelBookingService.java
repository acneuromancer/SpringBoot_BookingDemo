package com.romaniancoder.booking.service;

import com.romaniancoder.booking.domain.HotelBooking;
import com.romaniancoder.booking.repository.HotelBookingRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author corto
 */
@Service
public class HotelBookingService {
    
    private HotelBookingRepository repo;
    
    public HotelBookingService(HotelBookingRepository repo) {
        this.repo = repo;
    }

    public List<HotelBooking> findAll() {
        return repo.findAll();
    }

    public void save(HotelBooking hotelBooking) {
       repo.save(hotelBooking);
    }

    public void deleteById(long id) {
        repo.deleteById(id);
    }
    
}
