package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

//        I18NController i18N = (I18NController) ctx.getBean("i18NController");
//        System.out.println(i18N.sayHello());

        //Classname, but lowercase by default. Also, without casting a MyController object, bean will just return an object type
        MyController myC = (MyController) ctx.getBean("myController");

//        System.out.println("------ Primary Bean");
//        System.out.println(myC.sayHello());

        System.out.println(myC.hello());

        System.out.println("------ Property");

//        PropertyInjectedController pic = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
//        System.out.println(pic.getGreeting());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());

//        System.out.println("------ Setter");

//        SetterInjectedController sic = (SetterInjectedController) ctx.getBean("setterInjectedController");
//        System.out.println(sic.getGreeting());

        System.out.println("------ Getter");
        System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());

        System.out.println("------ Constructor");

//        ConstructorInjectedController cic = (ConstructorInjectedController) ctx.getBean(
//                "constructorInjectedController");
//        System.out.println(cic.getGreeting());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
