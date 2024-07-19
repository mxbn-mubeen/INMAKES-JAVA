package javabasedannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
    	
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Inmakes in=context.getBean(Inmakes.class);
        in.displayCourse();
        
    }
}
