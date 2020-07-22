package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo";
    }

    @Override
    public String getEnglishGreeting() {
        return "Hello World";
    }

    @Override
    public String getGermanGreeting() {
        return "Halo Walt";
    }
}
