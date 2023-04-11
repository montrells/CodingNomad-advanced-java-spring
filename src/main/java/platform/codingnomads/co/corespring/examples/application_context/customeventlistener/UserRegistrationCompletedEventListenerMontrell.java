package platform.codingnomads.co.corespring.examples.application_context.customeventlistener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationCompletedEventListenerMontrell implements ApplicationListener<UserRegistrationCompletedEvent> {

    @Override
    public void onApplicationEvent(UserRegistrationCompletedEvent event) {
        System.out.println("-----IM a second listener-----");
        System.out.println("-----Sending Email To: " + event.getMessage() + "-----");
    }
}
