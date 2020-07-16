package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService gs;

    public MyController(GreetingService gs) {
        this.gs = gs;
    }

    public String sayHello(){
        return gs.sayGreeting();
    }
}
