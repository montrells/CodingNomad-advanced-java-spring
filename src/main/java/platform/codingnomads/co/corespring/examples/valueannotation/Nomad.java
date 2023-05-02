package platform.codingnomads.co.corespring.examples.valueannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class Nomad {

    private String name;
    private Integer age;
    private String happiness;



    public Nomad(@Value("${nomad.name}") String name, @Value("${nomad.age}") Integer age,@Value("${nomad.happiness}") String happiness){
        this.name = name;
        this.age = age;
        this.happiness =happiness;
    }

    public String getHappiness() {
        return happiness;
    }

    @Value("Hello!!")
    private String greeting;

    @Value("${nomad.description}")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Value("${nomad.birthDate}")
    private String birthDate;
    @Value("${nomad.framework}")
    private String framework;

    @Value("${nomad.jdk}")
    private String jdk;

    @Value("${nomad.ide:IntelliJ IDEA}")
    private String ide;

    @Value("${nomad.workingDays}")
    private List<String> workingDays;

    @Value("#{${database.values}}")
    private Map<String, String> databaseValues;

    public String nomadIdentity() {
        return name.concat(" ").concat(age.toString());
    }

    public String getGreeting() {
        return greeting;
    }

    public String output() {
        return "Spring Developer is building awesome software using: ".concat(jdk).concat(" , ").concat(framework);
    }

    public List<String> getWorkingDays() {
        return workingDays;
    }

    public Map<String, String> getDatabaseValues() {
        return databaseValues;
    }
}
