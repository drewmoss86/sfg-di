package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService gs;

    public void setGreeting(GreetingService gs){
        this.gs = gs;
    }

    public String getGreeting(){
        return gs.sayGreeting();
    }

}
