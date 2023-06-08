package platform.codingnomads.co.springdata.example.dml.derivedquerymethods.myexample;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bigCat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Lion {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    private LionType lionType;

    private String catType;

    @Column(nullable = false)
    private boolean color;

    private Integer numDaysTillAdult;

    @PrePersist
    @PreUpdate
    private void checkForIllegalCountry() {
        if(!color && !Objects.isNull(numDaysTillAdult)) {
            throw new IllegalStateException("If the plant is not brown and is not an adult");
        }
    }
}
