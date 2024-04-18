package inhatc.cse.spring.di.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigJavaConfig.class);
        inhatc.cse.spring.di.javaconfig.Student student1 = ctx.getBean("student1", inhatc.cse.spring.di.javaconfig.Student.class);
        System.out.println(student1.getHeight());
        System.out.println(student1.getWeight());

        inhatc.cse.spring.di.javaconfig.Student student2 = ctx.getBean("student2", inhatc.cse.spring.di.javaconfig.Student.class);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
