package platform.codingnomads.co.corespring.examples.componentscanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "platform.codingnomads.co.corespring.examples.componentscanannotation.office")
public class ComponentScanConfiguration {

    @Bean
    public SampleBean sampleBean() {
        return new SampleBean();
    }
    @Bean
    public Desk desk() {
        return new Desk();
    }

}
