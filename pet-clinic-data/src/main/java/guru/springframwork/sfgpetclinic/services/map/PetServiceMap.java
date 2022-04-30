package guru.springframwork.sfgpetclinic.services.map;

import guru.springframwork.sfgpetclinic.model.Pet;

import guru.springframwork.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Profile({"default","map"})
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long>
                            implements PetService
{
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
            super.delete(object);
    }

}
