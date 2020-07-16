package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    public GreetingService gs;

    public String getGreeting(){
        return gs.sayGreeting();
    }
}
