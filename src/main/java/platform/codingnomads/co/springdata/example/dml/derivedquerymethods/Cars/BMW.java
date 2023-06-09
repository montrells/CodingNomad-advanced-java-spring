package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.Cars;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "BMWs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BMW {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String model;

    @Column
    private String make;
}
