package inhatc.cse.spring.di.java_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.ArrayList;

@Configuration
@ImportResource("classpath:java_xml/appCTX.xml")
public class ApplicationConfigJavaXml {

    @Bean
    public Student student1() {
        ArrayList<String> hobbys = new ArrayList<String>();
        hobbys.add("탁구");
        hobbys.add("축구");

        Student student = new Student("김진진", 25, hobbys);
        student.setHeight(177.5);
        student.setWeight(65.5);

        return student;
    }
}
