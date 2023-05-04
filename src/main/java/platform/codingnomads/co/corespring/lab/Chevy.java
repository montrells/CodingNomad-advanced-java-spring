package platform.codingnomads.co.corespring.lab;

import lombok.*;
import org.springframework.context.annotation.Import;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Chevy implements Vehicle{
    String name = "Cavalier";
    String engine = "280 horsepower";
    String speed = "250km per hour";



    public void driving() {
        System.out.println("Chevy is slowly on the move!");
    }

}
