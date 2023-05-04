package platform.codingnomads.co.corespring.lab;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import platform.codingnomads.co.corespring.lab.complete.record;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class VehicleDemo {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//       var context = new ClassPathXmlApplicationContext("/codingnomads/corespring/examples/lab/Chevy.xml");
       ctx.register(VehicleConfig.class);
       ctx.refresh();
        BMW bmw = ctx.getBean(BMW.class);
        FORD ford = ctx.getBean(FORD.class);
        Chevy chevy = ctx.getBean(Chevy.class);

        System.out.println("Model of the BMW "+bmw.name);
        System.out.println("Model of the Ford "+ford.name);
        System.out.println("Model of the Chevy "+chevy.name);
//        for (String c : chevy) {
//            System.out.println("Model of the Chevy " + ctx.getBean(c, platform.codingnomads.co.corespring.lab.Chevy.class));
//        }
        ctx.close();


    }
}
