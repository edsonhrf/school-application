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
public class Documents {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO) //H2 database, case is postgresql is IDENTITY
    private Long id;

    @ManyToOne
    @JoinColumn(name = "person_id")
    private Long personId;
}
