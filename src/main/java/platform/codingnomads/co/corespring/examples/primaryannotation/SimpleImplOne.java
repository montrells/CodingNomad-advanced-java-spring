package platform.codingnomads.co.corespring.examples.primaryannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SimpleImplOne implements SimpleInterface{
    public SimpleImplOne(){
        System.out.println("I am SimpleImplOne");
    }
}
