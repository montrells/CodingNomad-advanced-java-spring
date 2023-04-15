package platform.codingnomads.co.corespring.examples.annotations.whatandwhy;

import java.lang.reflect.Method;

public class AnnotationParsingDemo {
    public static void main(String[] args) {
        try {
            Class<AnnotationDemoService> annotationDemoService = AnnotationDemoService.class;
            for (Method method : annotationDemoService.getMethods()) {
                if (method.isAnnotationPresent(SecondaryData.class)) {
                    SecondaryData modernInfo = method.getAnnotation(SecondaryData.class);
                    System.out.println("Info Received: " + modernInfo.data());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
