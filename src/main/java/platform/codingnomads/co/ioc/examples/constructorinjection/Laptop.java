package platform.codingnomads.co.ioc.examples.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private Processor processor;
    private OS os;

    private LaptopComponent laptopComponent;

    // these fields are being injected from the ApplicationContext
    // if a class contains only one constructor (as this one does), the use of @Autowired is optional
    // if a class contains two or more constructors, @Autowired is required for constructor injection to take place
    public Laptop(Processor processor, OS os, LaptopComponent laptopComponent) {
        this.processor = processor;
        this.os = os;
        this.laptopComponent = laptopComponent;
    }

    public String printLaptopConfiguration() {
        return "processor: " + processor.getCore() + " core " + processor.getName() +
                "\nOS: " + os.getName() + "\nstorage: " +laptopComponent.getComponent();
    }
}
