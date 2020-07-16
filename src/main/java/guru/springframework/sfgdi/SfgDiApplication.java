package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        //Classname, but lowercase by default. Also, without casting a MyController object, bean will just return an object type
        MyController myC = (MyController) ctx.getBean("myController");

        String greeting= myC.sayHello();

        System.out.println(greeting);
    }

}
