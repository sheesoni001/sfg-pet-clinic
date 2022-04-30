package guru.springframwork.sfgpetclinic.repository;

import guru.springframwork.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
