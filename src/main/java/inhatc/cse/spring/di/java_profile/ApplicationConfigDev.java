package inhatc.cse.spring.di.java_profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ApplicationConfigDev {

    @Bean
    public ServerInfoJava serverInfo(){
        ServerInfoJava serverInfoJava = new ServerInfoJava();
        serverInfoJava.setIpNum("localhost");
        serverInfoJava.setPortNum("8181");
        return serverInfoJava;
    }
}
