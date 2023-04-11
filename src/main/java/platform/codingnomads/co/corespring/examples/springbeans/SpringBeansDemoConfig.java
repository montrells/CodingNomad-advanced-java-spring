package platform.codingnomads.co.corespring.examples.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.corespring.examples.springbeans.beans.Telephone;

@Configuration
@ComponentScan(basePackages = "platform.codingnomads.co.corespring.examples.springbeans.beans")
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
