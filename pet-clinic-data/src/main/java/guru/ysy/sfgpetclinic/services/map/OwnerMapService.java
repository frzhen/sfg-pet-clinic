package guru.ysy.sfgpetclinic.services.map;

import guru.ysy.sfgpetclinic.model.Owner;
import guru.ysy.sfgpetclinic.model.Pet;
import guru.ysy.sfgpetclinic.services.OwnerService;
import guru.ysy.sfgpetclinic.services.PetService;
import guru.ysy.sfgpetclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/7 15:45
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerMapService(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (object == null || object.getPets() == null) {
            return null;
        } else {
            object.getPets().forEach(pet -> {
                if (pet.getPetType() != null){
                    if(pet.getPetType().getId() == null){
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                } else {
                    throw new NullPointerException("Pet Type is required");
                }
                if (pet.getId() == null) {
                    Pet savedPet = petService.save(pet);
                    pet.setId(savedPet.getId());
                }
            });
            return super.save(object);
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
       super.deleteById(id);
    }
}
