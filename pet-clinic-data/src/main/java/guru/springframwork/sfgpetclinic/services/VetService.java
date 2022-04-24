package guru.springframwork.sfgpetclinic.services;


import guru.springframwork.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);
    Vet save(Vet vet);
    Set<Vet> finAll();

}
