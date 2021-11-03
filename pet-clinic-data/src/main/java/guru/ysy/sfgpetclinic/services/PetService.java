package guru.ysy.sfgpetclinic.services;

import guru.ysy.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/3 21:07
 */
public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();

}
