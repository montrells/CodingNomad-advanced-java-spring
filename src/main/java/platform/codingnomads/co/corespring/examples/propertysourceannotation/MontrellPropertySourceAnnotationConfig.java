package platform.codingnomads.co.corespring.examples.propertysourceannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource(value = "montrellapp.properties", ignoreResourceNotFound = true)
public class MontrellPropertySourceAnnotationConfig { }
