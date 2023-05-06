package platform.codingnomads.co.springdata.example.moderndatabaseintegration.spring_jdbc;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import platform.codingnomads.co.springdata.example.springdatajdbc.SpringDataJDBCDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringDataJDBCExample implements CommandLineRunner {


    @Autowired
    JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJDBCDemo.class);
    }

    @Override
    public void run(String... strings) {

        try {
            //create employee table using the JdbcTemplate method "execute"
            jdbcTemplate.execute("CREATE TABLE managers (id BIGINT AUTO_INCREMENT PRIMARY KEY," +
                    "first_name VARCHAR(255) NOT NULL,last_name  VARCHAR(255) NOT NULL);");
        } catch (Exception e) {
            //nothing
        }

        //create a list of first and last names
        List<Object[]> splitUpNames = Stream.of("Java Ninja", "Spring Guru", "Java Guru", "Spring Ninja")
                .map(name -> name.split(" "))
                .collect(Collectors.toList());

//        for each first & last name pair insert an Employee into the database
        for (Object[] name : splitUpNames) {
            jdbcTemplate.execute(String.format("INSERT INTO employees(first_name, last_name) VALUES ('%s','%s')", name[0], name[1]));
        }

        //query the database for Employees with first name Java
        jdbcTemplate.query(
                        "SELECT id, first_name, last_name FROM managers WHERE first_name = 'Java'",
                        (rs, rowNum) -> new Employee((int) rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name"))
                )
                //print each found employee to the console
                .forEach(employee -> System.out.println(employee.toString()));

       // truncate the table
        jdbcTemplate.execute("TRUNCATE TABLE managers;");
        //delete the table
        jdbcTemplate.execute("DROP TABLE managers");
    }
//    @Override
//    public void run(String... args) throws Exception {
//
//        template.query("SELECT * FROM EMPLOYEES", new Object[]{},
//            (rs, rowNum) -> new Employee(
//                    rs.getInt("id"),
//                    rs.getString("first_name"),
//                    rs.getString("last_name")
//            )
//        ).forEach(employee -> System.out.println(employee.toString()));
//    }
}

@Data
@AllArgsConstructor
class Employee {
    private int id;
    private String firstName;
    private String lastName;
}
@Data
@AllArgsConstructor
class Manager {
    private int id;
    private String firstName;
    private String lastName;
}
