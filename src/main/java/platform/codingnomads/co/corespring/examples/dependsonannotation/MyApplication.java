package platform.codingnomads.co.corespring.examples.dependsonannotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MyApplication {
    @Autowired
    private JDK jdk;

    public MyApplication() {
        System.out.println("MyApplication is ready.");
    }
}
