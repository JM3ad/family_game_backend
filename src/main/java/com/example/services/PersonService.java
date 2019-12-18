package com.example.services;

import com.example.models.Person;
import com.example.repositories.PersonRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person get() throws NotFoundException {
        return personRepository.findById(1L).orElseThrow(()-> new NotFoundException("Error"));
    }
}
