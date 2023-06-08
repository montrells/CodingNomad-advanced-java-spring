package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.myexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import platform.codingnomads.co.springdata.example.dml.derivedquerymethods.plantexample.Plant;
import platform.codingnomads.co.springdata.example.dml.derivedquerymethods.plantexample.SoilType;

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
        LionType Africa = LionType.builder().name("Leo").brown(false).age(600).build();
        LionType AmericanMountains = LionType.builder().name("Mountains").brown(false).age(300).build();
        LionType HouseCats = LionType.builder().name("Tom").brown(false).age(300).build();

        Lion AfricanLion = Lion.builder()
                .name("Leo")
                .color(true)
                .lionType(Africa)
                .catType("Lion")
                .numDaysTillAdult(900)
                .build();

        Lion AmericanMountainLion = Lion.builder()
                .name("MountainLion")
                .color(true)
                .lionType(AmericanMountains)
                .catType("Panther")
                .numDaysTillAdult(600)
                .build();

        Lion HouseCat = Lion.builder()
                .name("Tom")
                .color(true)
                .catType("Feline")
                .catType("Domestic")
                .numDaysTillAdult(300)
                .build();

        lionRepo.save(AfricanLion);
        lionRepo.save(AmericanMountainLion);
        lionRepo.save(HouseCat);

        // DEMONSTRATE USE OF DERIVED QUERY METHODS

        System.out.println("\n********* findByName() *********");
        List<Lion> cats1 = lionRepo.findByName("Leo");
        cats1.forEach(System.out::println);

        System.out.println("\n********* findByNumDaysTillAdultAndCatType_color *********");
        List<Lion> cats2 = lionRepo.findByNumDaysTillAdultAndCatType_color(true, true);
        cats2.forEach(System.out::println);

        System.out.println("\n********* findByNameEndingWith() *********");
        List<Lion> cats3 = lionRepo.findByNameEndingWith("Lion");
        cats3.forEach(System.out::println);

        System.out.println("\n********* findFirstByCatType_nameIsTrue *********");
        Lion cats4 = lionRepo.findFirstByCatType_nameIsTrue();
        System.out.println(cats4.toString());

        lionRepo.deleteAll();
    }
}
