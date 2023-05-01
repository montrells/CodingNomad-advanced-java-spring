package platform.codingnomads.co.corespring.examples.configurationannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.corespring.examples.configurationannotation.beans.SampleFiveClass;
import platform.codingnomads.co.corespring.examples.configurationannotation.beans.SampleFourClass;

@Configuration
@ComponentScan
public class ConfigurationDemoConfig {



    @Bean
    public SampleClass sampleClass() {
        return new SampleClass();
    }
    @Bean
    
    public SampleTwoClass sampleTwoClass() {
        return new SampleTwoClass();
    }

    @Bean
    public SampleThreeClass sampleThreeClass() {
        return new SampleThreeClass();
    }
    @Bean
    public SampleFourClass sampleFourClass() {
        return new SampleFourClass();
    }
    @Bean
    public SampleFiveClass sampleFiveClass() {
        return new SampleFiveClass();
    }

}
