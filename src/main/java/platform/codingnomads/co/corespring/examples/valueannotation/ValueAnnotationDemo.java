package platform.codingnomads.co.corespring.examples.valueannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ValueAnnotationDemo {
    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(ValueAnnotationDemo.class);
        final Nomad nomad = ctx.getBean(Nomad.class);
        System.out.println(nomad.getGreeting());
        System.out.println(nomad.getBirthDate());
        System.out.println(nomad.getDescription());
        System.out.println(nomad.getHappiness());
        final String output = nomad.output();
        System.out.println(output);
        nomad.getWorkingDays().forEach(System.out::println);
        System.out.println(nomad.getDatabaseValues());
        System.out.println(nomad.nomadIdentity());
        ctx.close();
    }
}
