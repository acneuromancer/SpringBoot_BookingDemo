package com.romaniancoder.booking.controller;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author corto
 */
@Controller
public class ViewController {
    
    private String appMode;

    @Autowired
    public ViewController(Environment environment) {
        if (environment.getProperty("app-mode") == null) {
            this.appMode = "development";
        }
        
        this.appMode = environment.getProperty("app-mode");
    }
    
    @RequestMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("datetime", new Date());
        model.addAttribute("username", "John");
        
        model.addAttribute("mode", appMode);

        return "index";
    }
    
}
