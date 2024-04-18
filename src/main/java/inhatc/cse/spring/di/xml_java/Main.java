package inhatc.cse.spring.di.xml_java;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:xml_java/appCTX.xml");
        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());

        Student student2 = ctx.getBean("student2", Student.class);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
    }
}
