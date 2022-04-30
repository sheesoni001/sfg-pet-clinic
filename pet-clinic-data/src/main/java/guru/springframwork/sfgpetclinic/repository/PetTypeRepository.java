package guru.springframwork.sfgpetclinic.repository;

import guru.springframwork.sfgpetclinic.model.PetType;
import guru.springframwork.sfgpetclinic.services.CrudService;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
