package model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //AUTO for H2 database, case is postgresql is IDENTITY
    @Column
    private Long id;

    @Column
    private String street;

    @Column
    private String postalCode;

    @Column
    private String neighborhood;

    @Column
    private String observations;

    @Column
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Long personId;
}
