package inhatc.cse.spring.di.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigJavaConfig.class);
        StudentJavaConfig studentJavaConfig1 = ctx.getBean("student1", StudentJavaConfig.class);
        System.out.println(studentJavaConfig1.getHeight());
        System.out.println(studentJavaConfig1.getWeight());

        StudentJavaConfig studentJavaConfig2 = ctx.getBean("student2", StudentJavaConfig.class);
        System.out.println(studentJavaConfig2.getName());
        System.out.println(studentJavaConfig2.getAge());
    }
}
