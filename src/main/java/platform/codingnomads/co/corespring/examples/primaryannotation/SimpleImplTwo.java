package platform.codingnomads.co.corespring.examples.primaryannotation;

import org.springframework.stereotype.Component;

@Component
public class SimpleImplTwo implements SimpleInterface{
    public SimpleImplTwo(){
        System.out.println("I am SimpleImplTwo");
    }
}
