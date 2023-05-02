package platform.codingnomads.co.corespring.examples.scopeannotaion;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ScopeAnnotationDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(ScopeAnnotationDemoConfig.class);
        ctx.refresh();
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);

        SimpleOne simpleOne1 = ctx.getBean(SimpleOne.class);
        SimpleOne simpleOne2 = ctx.getBean(SimpleOne.class);


        System.out.println("-----Hashcode of SingletonBean-----");
        System.out.println(singletonBean1.hashCode());
        System.out.println(singletonBean2.hashCode());

        System.out.println(simpleOne1.hashCode());
        System.out.println(simpleOne2.hashCode());

        final PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        final PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);

        final SimpleTwo simpleTwo1 = ctx.getBean(SimpleTwo.class);
        final SimpleTwo simpleTwo2 = ctx.getBean(SimpleTwo.class);

        System.out.println("-----Hashcode of PrototypeBean-----");
        System.out.println(prototypeBean1.hashCode());
        System.out.println(prototypeBean2.hashCode());
        System.out.println();
        System.out.println(simpleTwo1.hashCode());
        System.out.println(simpleTwo2.hashCode());
        ctx.close();
    }
}
