package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.Cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BMWApplication implements CommandLineRunner {

    @Autowired
    BMWRepo bmwRepo;

    public static void main(String[] args) {
        SpringApplication.run(BMWApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
        BMWModel X5 = BMWModel.builder().name("X5").model("X5").year(2022).build();
        BMWModel X6 = BMWModel.builder().name("X6").model("X5").year(2023).build();
        BMWModel X7 = BMWModel.builder().name("X7").model("X5").year(2022).build();

        BMW bmwX5 = BMW.builder()
                .name("X5")
                .model("X5")
                .build();
        //BMWRepo.save(bmwX5);
    }
}
