package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // For spring to detect this as a Spring component
public class ConstructorInjectedController {

    private final GreetingService gs;

    // Does not require Autowire annotation
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService gs) {
        this.gs = gs;
    }

    public String getGreeting(){
        return gs.sayGreeting();
    }
}
