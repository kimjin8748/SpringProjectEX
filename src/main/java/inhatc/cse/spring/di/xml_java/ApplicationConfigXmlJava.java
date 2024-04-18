package inhatc.cse.spring.di.xml_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
public class ApplicationConfigXmlJava {

    @Bean
    public Student student1() {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("야구");
        hobbys.add("당구");

        Student student = new Student("김용진", 25, hobbys);
        student.setHeight(165.5);
        student.setWeight(82);

        return student;
    }
}
