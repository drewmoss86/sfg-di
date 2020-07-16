package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController sic = new SetterInjectedController();

    @BeforeEach
    void setUp(){
        sic.setGreeting(new ConstructorGreetingService());
    }

    @Test
    void getGreeting(){
        System.out.println(sic.getGreeting());
    }
}