package guru.springframwork.sfgpetclinic.bootstrap;

import guru.springframwork.sfgpetclinic.model.*;
import guru.springframwork.sfgpetclinic.services.OwnerService;
import guru.springframwork.sfgpetclinic.services.PetTypeService;
import guru.springframwork.sfgpetclinic.services.SpecialityService;
import guru.springframwork.sfgpetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }
//    public DataLoader()
//    {
//        ownerService =new OwnerServiceMap();
//        vetService =new VetServiceMap();
//    }


    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size()==0)
        {
            loadData();
        }

    }

    private void loadData() {
        PetType dog =new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat =new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = specialityService.save(radiology);
        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = specialityService.save(surgery);
        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastname("Watson");
        owner1.setAddress("123 Briclen");
        owner1.setCity("Miami");
        owner1.setTelephone("123456");

        Pet mikesPet =new Pet();
        mikesPet.setPetTYpe(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setBirthdate(LocalDate.now());
        mikesPet.setName("Roskow");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fiona");
        owner2.setLastname("Glenee");
        owner2.setAddress("123 Briclen");
        owner2.setCity("Miami");
        owner2.setTelephone("123456");

        Pet finosCat =new Pet();
        finosCat.setName("just cat");
        finosCat.setOwner(owner2);
        finosCat.setBirthdate(LocalDate.now());
        finosCat.setPetTYpe(savedCatPetType);
        owner2.getPets().add(finosCat);


        ownerService.save(owner2);
        System.out.println("Loaded Owners");
        Vet vet1 = new Vet();

        vet1.setFirstName("Sam");
        vet1.setLastname("Axe");
        vet1.getSpecialities().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Jesse");
        vet2.setLastname("Porter");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
        System.out.println("Loaded Vets");
    }
}
