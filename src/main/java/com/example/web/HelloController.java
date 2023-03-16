package com.example.web;

import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HelloController {
    private final List<billett> billetter = new ArrayList<>();

    @PostMapping("/addbillett")
    public void addbillett(@RequestBody billett object) {
        System.out.println("Data recieved.");
        billetter.add(object);
    }

   @GetMapping("/getbillett")
    public List<billett> getbilletter() {
        return billetter;
    }
    @PostMapping("/slettbilletter")
    public void slettbilletter() {
        System.out.println("Data deleted.");
        billetter.clear();
    }
}

