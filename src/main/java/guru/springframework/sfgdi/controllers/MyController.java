package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService gs;

    public MyController(GreetingService gs) {
        this.gs = gs;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return gs.sayGreeting();
    }
}
