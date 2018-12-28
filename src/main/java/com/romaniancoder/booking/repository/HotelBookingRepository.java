/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.romaniancoder.booking.repository;

import com.romaniancoder.booking.domain.HotelBooking;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author corto
 */

@Repository
public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long>{

    List<HotelBooking> findByPricePerNightLessThan(double price);
    
}
