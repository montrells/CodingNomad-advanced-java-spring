package platform.codingnomads.co.corespring.examples.beanscopes.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ProtoTypeDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(PrototypeDemoConfig.class);
        ctx.refresh();

        SpringBean springBean1 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean1.hashCode());

        SpringBean springBean2 = ctx.getBean(SpringBean.class);
        System.out.println("Hash code: " + springBean2.hashCode());

        SpringBeanTwo springBeanTwo2 = ctx.getBean(SpringBeanTwo.class);
        System.out.println("Hash code: " + springBeanTwo2.hashCode());

        SpringBeanTwo springBeanTwo3 = ctx.getBean(SpringBeanTwo.class);
        System.out.println("Hash code: " + springBeanTwo3.hashCode());

        ctx.close();
    }
}
