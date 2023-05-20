package platform.codingnomads.co.springdata.example.ddl.manytoone.bidirectional;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, updatable = false)
    private String username;

    @Column(nullable = false)
    private String content;

    @OneToMany(mappedBy = "post")
    private Set<Comment> comments;
    //Many post to one blog
    @ManyToOne(
            cascade = CascadeType.ALL,
            optional = false
    )
    @JoinColumn(name = "blog_id")
    private Blog blog;

}
