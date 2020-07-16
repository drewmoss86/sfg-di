package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService gs;

    @Qualifier("setterInjectedGreetingService")
    @Autowired // For injecting service into controller
    public void setGreeting(GreetingService gs){
        this.gs = gs;
    }

    public String getGreeting(){
        return gs.sayGreeting();
    }

}
