package platform.codingnomads.co.corespring.examples.springbeans;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringBeansDemo {
//Telephone added to the context
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringBeansDemoConfig.class);
        SpringDeveloper springDeveloper = ctx.getBean(SpringDeveloper.class);
        var telephone = ctx.getBean(Telephone.class);
        System.out.println("Spring Developer Address: " + springDeveloper.getAddress().getStreetNumber() + " " +
                springDeveloper.getAddress().getStreet());
        System.out.println("Spring Developer Telephone (Direct from context) " + telephone.getTelephone());

    }
}
