package inhatc.cse.spring.di.lifecycle;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("classpath:lifecycle/appCTX.xml");

        ctx.refresh();

        StudentLife student = ctx.getBean("student", StudentLife.class);
        System.out.println(student.getName());

        OtherStudent otherStudent = ctx.getBean("otherStudent", OtherStudent.class);
        System.out.println(otherStudent.getName());

        ctx.close();
    }
}
