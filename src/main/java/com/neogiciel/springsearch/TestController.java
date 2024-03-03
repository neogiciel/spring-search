package com.neogiciel.springsearch;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neogiciel.springsearch.util.Trace;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;


@RestController
public class TestController {

    @GetMapping
    @RequestMapping("/test")
    public String page() {
        
        Trace.info("Appel rest Test page");

        return "test";
    }



  
}
