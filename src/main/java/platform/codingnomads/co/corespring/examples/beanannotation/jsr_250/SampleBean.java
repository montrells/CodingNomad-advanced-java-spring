package platform.codingnomads.co.corespring.examples.beanannotation.jsr_250;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SampleBean {

    public SampleBean() {
        System.out.println("bean is getting ready!");
    }

    @PostConstruct
    public void init() {
        System.out.println("bean MONTRELL@PostConstruct is gathering resources..");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("time to MONTRELL@PreDestroy and head home..");
    }

    @PostConstruct
    public void montrellPostConstruct() {
        System.out.println("PostCostruct() - bean is doing its thing");
    }
    @PreDestroy
    public void montrellPreDestruct() {
        System.out.println("PreDestruct() - bean is doing its thing");
    }
}
