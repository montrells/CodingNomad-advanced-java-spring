package platform.codingnomads.co.springdata.example.ddl.joincolumn;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "examples")
@NoArgsConstructor
@Getter
@Setter
public class Example {

    @Id
    @GeneratedValue
    private Long id;

    //define a one-to-many relationship with a few customizations
    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    //use @JoinColumns to indicate multiple join columns are needed in the examples table
    @JoinColumns({
            //define the first join column. It will be called referenced_id and references the id column in the user table
            @JoinColumn(name = "user_id", referencedColumnName = "id"),
            //define the second join column. It will be called references_name and references the name column in the user table
            @JoinColumn(name = "user_name", referencedColumnName = "name")

    })
    private User user;
    //define a one-to-many relationship with a few customizations
    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    //use @JoinColumns to indicate multiple join columns are needed in the examples table
    @JoinColumns({
            //define the first join column. It will be called referenced_id and references the id column in the user table
            @JoinColumn(name = "person_references_person_id", referencedColumnName = "person_id"),
            //define the second join column. It will be called references_name and references the name column in the user table
            @JoinColumn(name = "person_references_person_address", referencedColumnName = "person_address")

    })
    private Person person;
}
