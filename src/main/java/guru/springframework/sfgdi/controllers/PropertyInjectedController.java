package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller // For spring to detect this as a Spring component
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired // For injecting service into controller
    public GreetingService gs;

    public String getGreeting(){
        return gs.sayGreeting();
    }
}
