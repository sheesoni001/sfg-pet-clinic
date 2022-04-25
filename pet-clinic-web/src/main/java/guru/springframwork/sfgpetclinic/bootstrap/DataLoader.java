package guru.springframwork.sfgpetclinic.bootstrap;

import guru.springframwork.sfgpetclinic.map.OwnerServiceMap;
import guru.springframwork.sfgpetclinic.map.PetServiceMap;
import guru.springframwork.sfgpetclinic.map.VetServiceMap;
import guru.springframwork.sfgpetclinic.model.Owner;
import guru.springframwork.sfgpetclinic.model.Pet;
import guru.springframwork.sfgpetclinic.model.Vet;
import guru.springframwork.sfgpetclinic.services.OwnerService;
import guru.springframwork.sfgpetclinic.services.PetService;
import guru.springframwork.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

   public DataLoader()
   {
       ownerService =new OwnerServiceMap();
       vetService =new VetServiceMap();
   }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastname("Watson");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastname("Glenee");

        ownerService.save(owner2);
        System.out.println("Loaded Owners");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastname("Axe");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Jesse");
        vet2.setLastname("Porter");
        vetService.save(vet2);
        System.out.println("Loaded Vets");
    }
}