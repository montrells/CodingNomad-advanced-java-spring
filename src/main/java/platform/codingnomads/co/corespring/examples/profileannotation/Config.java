package platform.codingnomads.co.corespring.examples.profileannotation;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
@PropertySource(value = "application-deploy.properties",ignoreResourceNotFound = true)
public class Config {
//    @Bean
//    public SpringDeveloper springDeveloper() {
//        return new SpringDeveloper();
//    }
//
//    @Bean
//    public SpringMontrell springMontrell(){
//        return new SpringMontrell();
//    }

}
