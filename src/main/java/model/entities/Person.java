package model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //H2 database, case is postgresql is IDENTITY
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    @OneToMany(mappedBy = "personId")
    private List<Adress> adress;

}
