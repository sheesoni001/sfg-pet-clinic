package guru.springframwork.sfgpetclinic.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetTYpe() {
        return petTYpe;
    }

    public void setPetTYpe(PetType petTYpe) {
        this.petTYpe = petTYpe;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }
}
