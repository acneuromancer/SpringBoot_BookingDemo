package com.romaniancoder.booking.controller;

import com.romaniancoder.booking.domain.HotelBooking;
import com.romaniancoder.booking.repository.HotelBookingRepository;
import java.util.List;
import org.jsondoc.core.annotation.Api;
import org.jsondoc.core.annotation.ApiMethod;
import org.jsondoc.core.annotation.ApiPathParam;
import org.jsondoc.core.pojo.ApiStage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corto
 */

@RestController
@RequestMapping(value = "/bookings")
@Api(
        name = "Hotel Booking API",
        description = "Provides a list of methods that manage hotel bookings.",
        stage = ApiStage.RC
)
public class HotelBookingController {
    
    private HotelBookingRepository repo;

    @Autowired
    public HotelBookingController(HotelBookingRepository repo) {
        this.repo = repo;
    }
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiMethod(description = "Get all hotel bookings from the database.")
    public List<HotelBooking> getAll() {
        return repo.findAll();
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ApiMethod(description = "Create a hotel booking and save it to the database.")
    public List<HotelBooking> create(@RequestBody HotelBooking hotelBooking) {
        repo.save(hotelBooking);
        return repo.findAll();
    }
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ApiMethod(description = "Remove the hotel booking with the provided ID from the database.")
    public List<HotelBooking> remove (@ApiPathParam(name="id") @PathVariable long id) {
        repo.deleteById(id);
        return repo.findAll();
    }
    
}
