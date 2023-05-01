package platform.codingnomads.co.corespring.examples.autowiredannotation;

import groovy.transform.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@ToString
public class LaptopComputer {
    @Autowired
    @Qualifier("geforce")
    private VideoCard videoCard;
    @Autowired
    @Qualifier("cassio")
    private Cassio cassio;
    @Autowired
    @Qualifier("dell")
    private Dell dell;
}
