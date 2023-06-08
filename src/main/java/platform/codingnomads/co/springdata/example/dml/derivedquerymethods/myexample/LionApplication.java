package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.myexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LionApplication implements CommandLineRunner {

    @Autowired
    LionRepo lionRepo;

    public static void main(String[] args) {
        SpringApplication.run(LionApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        LionLocation Africa = LionLocation.builder().name("Leo").brown(false).ph(600).build();
        LionLocation AmericanMountains = LionLocation.builder().name("Mountains").brown(false).ph(300).build();

        Lion AfricanLion = Lion.builder()
                .name("Leo")
                .color(true)
                .lionLocation(Africa)
                .catType("Lion")
                .numDaysTillAdult(900)
                .build();

        Lion AmericanMountainLion = Lion.builder()
                .name("MountainLion")
                .color(true)
                .lionLocation(AmericanMountains)
                .catType("Panther")
                .numDaysTillAdult(600)
                .build();



        lionRepo.save(AfricanLion);
        lionRepo.save(AmericanMountainLion);

        // DEMONSTRATE USE OF DERIVED QUERY METHODS

        System.out.println("\n********* findByName() *********");
        List<Lion> plants1 = lionRepo.findByName("Leo");
        plants1.forEach(System.out::println);

        System.out.println("\n********* findByNumDaysTillAdultAndCatType_color *********");
        List<Lion> plants2 = lionRepo.findByNumDaysTillAdultAndCatType_color(true, true);
        plants2.forEach(System.out::println);

        System.out.println("\n********* findByNameEndingWith() *********");
        List<Lion> plants3 = lionRepo.findByNameEndingWith("Lion");
        plants3.forEach(System.out::println);

        System.out.println("\n********* findFirstByFavoriteSoilType_dryIsTrue() *********");
        Lion lion4 = lionRepo.findFirstByCatType_nameIsTrue();
        System.out.println(lion4.toString());

        lionRepo.deleteAll();
    }
}
