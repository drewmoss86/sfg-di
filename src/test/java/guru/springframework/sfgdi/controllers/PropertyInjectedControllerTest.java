package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController pic = new PropertyInjectedController();;

    @BeforeEach
    void setUp(){
        pic.gs = new ConstructorGreetingService(); // Manual property injection
    }

    @Test
    void getGreeting(){
        System.out.println(pic.getGreeting());
    }

}