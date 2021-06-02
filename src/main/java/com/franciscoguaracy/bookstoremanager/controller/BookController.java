package com.franciscoguaracy.bookstoremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books") // colocar a notação @RequestMapping dentro da classe
                                 // se não puser a notação @GetMapping dentro da classe


public class BookController {
 @GetMapping


    public String hello(){

        return "Hello Bookstore Manager";
    }
}
