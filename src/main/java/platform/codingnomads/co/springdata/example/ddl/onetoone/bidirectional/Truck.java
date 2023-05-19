package platform.codingnomads.co.springdata.example.ddl.onetoone.bidirectional;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "trucks")
@NoArgsConstructor
@Getter
@Setter
public class Truck {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String brand;

    @Column(name = "horsepower")
    private int horsepower;

    //note that this annotation and field is new
    @OneToOne(
            //used to indicate that this is the child side of a relationship and refer the JPA
            //to the field in the Driver class that defines the relationship
            mappedBy = "truck"
    )
    private Driver driver;
}
