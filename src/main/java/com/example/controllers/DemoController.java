package com.example.controllers;

import com.example.models.Person;
import com.example.services.PersonService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    String index() {
        return "This will be returned directly";
    }

    @RequestMapping("/person")
    Person person() throws NotFoundException {
        return personService
                .get();
    }
}
