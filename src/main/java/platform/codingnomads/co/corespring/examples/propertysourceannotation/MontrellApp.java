package platform.codingnomads.co.corespring.examples.propertysourceannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MontrellApp {
    @Value("${app.name}")
    private String appNameMontrell;

    @Value("${app.version}")
    private String appVersionMontrell;

    public String getAppNameMontrell() {
        return appNameMontrell;
    }

    public String getAppVersionMontrell() {
        return appVersionMontrell;
    }
}
