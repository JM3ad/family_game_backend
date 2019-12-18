package com.example.services;

import com.example.models.Person;
import com.example.repositories.PersonRepository;
import javassist.NotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonServiceTest {

    @InjectMocks
    private PersonService personService;

    @Mock
    private PersonRepository personRepository;

    @Before
    public void setup(){
        when(personRepository.findById(1L)).thenReturn(Optional.of(new Person("TEST", "FAKE")));
    }

    @Test
    public void personService_GetsTheFirstPerson() throws NotFoundException {
        Person people = personService.get();

        Assert.assertEquals(people.getFirstName(), "TEST");
    }
}