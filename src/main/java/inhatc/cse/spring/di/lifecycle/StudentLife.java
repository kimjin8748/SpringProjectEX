package inhatc.cse.spring.di.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class StudentLife implements InitializingBean, DisposableBean {
    private String name;
    private int age;

    public StudentLife(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("종료시");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("시작시");
    }
}
