package guru.ysy.sfgpetclinic.services.map;

import guru.ysy.sfgpetclinic.model.Pet;
import guru.ysy.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/7 15:53
 */
public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet, Long> {
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
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}