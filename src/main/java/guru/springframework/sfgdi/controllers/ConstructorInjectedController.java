package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService gs;

    public ConstructorInjectedController(GreetingService gs) {
        this.gs = gs;
    }

    public String getGreeting(){
        return gs.sayGreeting();
    }
}
