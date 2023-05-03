package platform.codingnomads.co.corespring.examples.profileannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class Config {
//    @Profile("deploy")
    @Bean
    public SpringDeveloper springDeveloper(){
        return new SpringDeveloper();
    }

    @Bean
    public SpringMontrell springMontrell(){
        return new SpringMontrell();
    }

}
