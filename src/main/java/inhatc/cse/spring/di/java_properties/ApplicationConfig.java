package inhatc.cse.spring.di.java_properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
public class ApplicationConfig {

    @Value("${admin.id}")
    private String adminId;

    @Value("${admin.pw}")
    private String adminPw;

    @Value("${sub_admin.id}")
    private String sub_adminId;

    @Value("${sub_admin.pw}")
    private String sub_adminPw;

    @Bean
    public static PropertySourcesPlaceholderConfigurer Properties() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource[] resources = new Resource[2];
        resources[0] = new ClassPathResource("java_properties/admin.properties");
        resources[1] = new ClassPathResource("java_properties/sub_admin.properties");
        configurer.setLocations(resources);
        return configurer;
    }

    @Bean
    public AdminConnect adminConfig() {
        AdminConnect adminConnect = new AdminConnect();
        adminConnect.setAdminId(adminId);
        adminConnect.setAdminPw(adminPw);
        adminConnect.setSubId(sub_adminId);
        adminConnect.setSubPw(sub_adminPw);

        return adminConnect;

    }
}
