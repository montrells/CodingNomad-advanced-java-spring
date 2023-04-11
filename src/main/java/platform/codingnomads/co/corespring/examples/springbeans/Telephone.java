package platform.codingnomads.co.corespring.examples.springbeans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
public class Telephone {
    private String telephone;

    public Telephone(String telephone) {
        this.telephone = telephone;
    }
}
