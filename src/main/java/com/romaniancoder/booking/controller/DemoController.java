package com.romaniancoder.booking.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author corto
 */

@RestController
public class DemoController {
    
    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public String hello() {
        return "Hello World!";
    }
}
