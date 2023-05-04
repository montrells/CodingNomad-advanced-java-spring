package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehicleConfig {
    @Bean
    public FORD ford_f150(){
        return new FORD();
    }
    @Bean
    public BMW bmw(){
        return new BMW();
    }
    @Bean
    public Chevy chevy(){
        return new Chevy();
    }
}
