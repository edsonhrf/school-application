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
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //H2 database, case is postgresql is IDENTITY
    private Long id;

    @Column
    private String name;

    @Column
    private String dateOfBirth;

    @Column
    private String cpf;

    @Column
    private String rg;

    @Column
    @Enumerated(EnumType.STRING)
    private String sex;

    @Column
    @OneToMany(mappedBy = "personId")
    private List<Adress> adress;

    @Column
    private String email;
}
