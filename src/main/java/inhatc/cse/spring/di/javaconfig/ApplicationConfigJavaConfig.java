package inhatc.cse.spring.di.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfigJavaConfig {

    @Bean
    public StudentJavaConfig student1(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("수영");
        hobbys.add("요리");

        StudentJavaConfig studentJavaConfig = new StudentJavaConfig("홍길동", 20, hobbys);
        studentJavaConfig.setHeight(180);
        studentJavaConfig.setWeight(80);

        return studentJavaConfig;
    }

    @Bean
    public StudentJavaConfig student2(){
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("독서");
        hobbys.add("음악감상");

        StudentJavaConfig studentJavaConfig = new StudentJavaConfig("임꺽정", 18, hobbys);
        studentJavaConfig.setHeight(170);
        studentJavaConfig.setWeight(72);

        return studentJavaConfig;
    }
}
