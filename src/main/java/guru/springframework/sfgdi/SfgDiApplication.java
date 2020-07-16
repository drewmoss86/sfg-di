package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        //Classname, but lowercase by default. Also, without casting a MyController object, bean will just return an object type
        MyController myC = (MyController) ctx.getBean("myController");

        String greeting = myC.sayHello();

        System.out.println(greeting);

        System.out.println("------ Property");

        PropertyInjectedController pic = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(pic.getGreeting());

        System.out.println("------ Setter");

        SetterInjectedController sic = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println(sic.getGreeting());

        System.out.println("------ Constructor");

        ConstructorInjectedController cic = (ConstructorInjectedController) ctx.getBean(
                "constructorInjectedController");
        System.out.println(cic.getGreeting());
    }

}
