package com.example.sales.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sale")
@CrossOrigin("*")
public class SalesController {

    @GetMapping
    public String sales(){
        return "VENDIDO";
    }
}
