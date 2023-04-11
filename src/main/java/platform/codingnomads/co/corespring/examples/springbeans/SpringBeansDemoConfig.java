package platform.codingnomads.co.corespring.examples.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "platform.codingnomads.co.corespring.examples.springbeans")
public class SpringBeansDemoConfig {
    @Bean
    public Address address() {
        return new Address("Main Street", 1500);
    }
    @Bean
    public Telephone telephone(){
        return new Telephone("983-555-4353");
    }
}
