package platform.codingnomads.co.corespring.examples.profileannotation;

import lombok.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringMontrell {
   //@Value("${app.deploy}")
    public String deploy;

    public String getDeploy() {
        return deploy;
    }
}
