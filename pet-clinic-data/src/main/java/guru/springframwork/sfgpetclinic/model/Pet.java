package guru.springframwork.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Pets")
public class Pet extends BaseEntity {
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name="pet_type")
    private PetType petTYpe;
    @ManyToOne
    @JoinColumn(name="owner_id")
    private Owner owner;
    @Column(name="birth_date")
    private LocalDate birthdate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    Set<Visit> visits = new HashSet<>();

}
