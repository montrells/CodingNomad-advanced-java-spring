package platform.codingnomads.co.corespring.lab.complete;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CoreLabApplication {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(
                CoreLabConfig.class);

        Turntable turntable = ctx.getBean(Turntable.class);

        System.out.println("Time to sit down, relax, and listen to some records on my trusty "
                + turntable.getMake() + " " + turntable.getModel() + " turntable.");

        String[] records = ctx.getBeanNamesForType(record.class);

        for (String record : records) {
            System.out.println("Now listening to " + ctx.getBean(record, platform.codingnomads.co.corespring.lab.complete.record.class).getAlbum()
                    + " by " + ctx.getBean(record, platform.codingnomads.co.corespring.lab.complete.record.class).getArtist() + ".");
        }

        System.out.println("Done for the day!");
    }
}
