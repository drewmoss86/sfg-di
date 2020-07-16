package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController sic = new SetterInjectedController();

    @BeforeEach
    void setUp(){
        sic.setGreeting(new GreetingServiceImpl());
    }

    @Test
    void getGreeting(){
        System.out.println(sic.getGreeting());
    }
}