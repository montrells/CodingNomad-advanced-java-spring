package platform.codingnomads.co.corespring.lab;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
@Component
public class FORD implements Vehicle{
    String name = "F150";
    String engine = "V8";
    String speed = "250km per hour";


    @Override
    public void driving() {
        System.out.println("Ford is driving on the way!");
    }
}
