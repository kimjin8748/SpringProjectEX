package inhatc.cse.spring.di.scope;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:scope/appCTX.xml");

        StudentScope student1 = ctx.getBean("student", StudentScope.class);
        System.out.println("이름 : " + student1.getName());
        System.out.println("나이 : " + student1.getAge());

        System.out.println("==============================");

        StudentScope student2 = ctx.getBean("student", StudentScope.class);
        student2.setName("홀길자");
        student2.setAge(100);

        System.out.println("이름 : " + student1.getName());
        System.out.println("나이 : " + student1.getAge());

        System.out.println("==============================");

        if(student1.equals(student2)) {
            System.out.println("student1 == student2");
        } else {
            System.out.println("student1 != student2");
        }

        ctx.close();
    }
}
