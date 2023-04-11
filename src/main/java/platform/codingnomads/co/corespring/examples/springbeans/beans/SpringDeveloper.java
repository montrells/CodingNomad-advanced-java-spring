package platform.codingnomads.co.corespring.examples.springbeans.beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import platform.codingnomads.co.corespring.examples.springbeans.Address;

@Getter
@Setter
@Component
public class SpringDeveloper {

    private Address address;

    public SpringDeveloper(Address address) {
        this.address = address;
    }
}
