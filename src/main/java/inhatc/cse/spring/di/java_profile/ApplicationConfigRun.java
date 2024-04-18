package inhatc.cse.spring.di.java_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("run")
public class ApplicationConfigRun {

    @Bean
    public ServerInfoJava serverInfo(){
        ServerInfoJava serverInfoJava = new ServerInfoJava();
        serverInfoJava.setIpNum("123.123.123.23");
        serverInfoJava.setPortNum("80");
        return serverInfoJava;
    }
}
