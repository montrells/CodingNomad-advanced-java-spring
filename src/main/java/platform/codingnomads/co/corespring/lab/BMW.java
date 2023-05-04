package platform.codingnomads.co.corespring.lab;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
@AllArgsConstructor
@NoArgsConstructor
@Component
public class BMW implements Vehicle {
    String name = "M6";
    String engine = "V8";
    String speed = "300km per hour";
@Override
    public void driving() {
        System.out.println("BMW Fast on the move!");

    }



}
