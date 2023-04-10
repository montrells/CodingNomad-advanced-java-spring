package platform.codingnomads.co.corespring.examples.application_context.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import platform.codingnomads.co.ioc.lab.initial.Framework;
import platform.codingnomads.co.ioc.lab.initial.IDE;
import platform.codingnomads.co.ioc.lab.initial.JDK;

@Configuration
@ComponentScan("platform.codingnomads.co.corespring.examples.application_context.xml")
public class CodingNomadConfig {

    @Bean
    public platform.codingnomads.co.ioc.lab.initial.Framework framework() {
        return Framework.builder().name("Spring Book").version("2.5").build();
    }
    @Bean
    public platform.codingnomads.co.ioc.lab.initial.IDE ide() {
        return IDE.builder().name("Intellij IDEA").version("2021.1").build();
    }
    @Bean
    public platform.codingnomads.co.ioc.lab.initial.JDK jdk() {
        return JDK.builder().name("OpenJDK").version("11").build();
    }
}
