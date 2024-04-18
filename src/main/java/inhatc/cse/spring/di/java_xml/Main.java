package inhatc.cse.spring.di.java_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfigJavaXml.class);
        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println(student1.getHeight());
        System.out.println(student1.getAge());

        Student student2 = ctx.getBean("student2", Student.class);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
