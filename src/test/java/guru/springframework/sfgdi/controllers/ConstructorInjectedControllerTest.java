package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController cic;

    @BeforeEach
    void setUp() {
        cic = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(cic.getGreeting());
    }
}