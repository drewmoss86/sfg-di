package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final GreetingService gs;

    public I18NController(@Qualifier("i18NService") GreetingService gs) {
        this.gs = gs;
    }

    public String sayHello(){
        return gs.sayGreeting();
    }
}
