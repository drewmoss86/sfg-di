package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService gs;

    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService gs) {
        this.gs = gs;
    }

    public String sayHello(){
        return gs.sayGreeting();
    }
}
