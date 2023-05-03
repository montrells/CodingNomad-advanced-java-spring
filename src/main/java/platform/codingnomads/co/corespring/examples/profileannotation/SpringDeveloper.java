package platform.codingnomads.co.corespring.examples.profileannotation;

import io.lettuce.core.dynamic.annotation.Value;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
public class SpringDeveloper {

   // @Value("${app.test}")
    private String test;

    public String getTest() {
        return test;
    }
}
