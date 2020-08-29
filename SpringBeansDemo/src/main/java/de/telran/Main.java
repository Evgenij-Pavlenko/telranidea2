package de.telran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

//    StringService stringService = new StringService();
//    IntegerService integerService = new IntegerService();
//    Processor processor = new Processor(stringService, integerService);

        Processor processor = context.getBean("processor", Processor.class);

        processor.process();
    }
}
