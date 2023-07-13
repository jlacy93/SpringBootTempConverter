package org.launchcode.temperatureconverter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConverterController {
    //when user goes to /convert
    //then the user should see a form
    //with one input for the temp in F
    @GetMapping("/convert")
    @ResponseBody
    public String displayConvertForm(){
        return "<html>" +
                "<head><title>Convert Temperature from F to C</title></head>" +
                "<body>" +
                "<form method =\"post\">" +
                "<label for =\"tempF\">Temperature</label>" +
                "<input name =\"tempF\" placeholder=\"Fahrenheit\">" +
                "<button>Convert to Celsius</button>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/convert")
    @ResponseBody
    public String handleConvertForm(@RequestParam int tempF) {
        return "The temp " + tempF + " in F is " + String.valueOf((tempF - 32) * 5 / 9) + " in C!";
    }

}
