package com.example.lab03;

import org.springframework.web.bind.annotation.*;

@RestController
public class MathService {
    @RequestMapping(value = "/add/{x}/{y}", method = RequestMethod.GET)
    public double add(@PathVariable("x") double x,
                      @PathVariable("y") double y){
        return x + y;
    }
    @RequestMapping(value = "/minus/{x}/{y}", method = RequestMethod.GET)
    public double minus(@PathVariable("x") double x,
                        @PathVariable("y") double y){
        return x - y;
    }
    @RequestMapping(value = "/multiply", method = RequestMethod.GET)
    public double multiply(@RequestParam("num1") double num1,
                           @RequestParam("num2") double num2){
        return num1 * num2;
    }
    @RequestMapping(value = "/divide", method = RequestMethod.GET)
    public double divide(@RequestParam("num1") double num1,
                         @RequestParam("num2") double num2){
        return num1 / num2;
    }
}
