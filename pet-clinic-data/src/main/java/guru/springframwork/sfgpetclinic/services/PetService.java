package guru.springframwork.sfgpetclinic.services;
import guru.springframwork.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {

    Pet findById(Long Id);
    Pet save(Pet pet);
    Set<Pet> finAll();

}
