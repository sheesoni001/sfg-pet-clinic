package guru.springframwork.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
    private PetType petTYpe;
    private Owner owner;
    private LocalDate birthdate;

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
}
