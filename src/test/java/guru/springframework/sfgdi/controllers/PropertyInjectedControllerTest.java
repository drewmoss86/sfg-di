package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController pic = new PropertyInjectedController();;

    @BeforeEach
    void setUp(){
        pic.gs = new GreetingServiceImpl(); // Manual property injection
    }

    @Test
    void getGreeting(){
        System.out.println(pic.getGreeting());
    }

}