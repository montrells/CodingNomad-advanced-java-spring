package platform.codingnomads.co.ioc.lab.initial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("platform.codingnomads.co.ioc.lab.initial")
public class CodingNomadConfiguration {
//These objects/beans are being created using the Lombok builder.
    //Beans will be generated to be used in the application
    @Bean
    public Framework framework() {
        return Framework.builder().name("Spring Book").version("2.5").build();
    }
    @Bean
    public IDE ide() {
        return IDE.builder().name("Intellij IDEA").version("2021.1").build();
    }
    @Bean
    public JDK jdk() {
        return JDK.builder().name("OpenJDK").version("11").build();
    }
    @Bean
    public Computer computer() {
        return Computer.builder().name("Dell").version("2.2").build();
    }
    @Bean
    public Laptop laptop() {
        return Laptop.builder().name("Apple").version("11.5").build();
    }
}
