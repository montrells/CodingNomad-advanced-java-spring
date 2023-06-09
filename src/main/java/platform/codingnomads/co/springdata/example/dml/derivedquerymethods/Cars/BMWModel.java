package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.Cars;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "models")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BMWModel {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private int year;

    @Column
    private String model;
}
