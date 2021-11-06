package guru.ysy.sfgpetclinic.services;

import guru.ysy.sfgpetclinic.model.Owner;
import guru.ysy.sfgpetclinic.model.Pet;

/**
 * Created by zhenrui on 2021/11/3 21:07
 */
public interface PetService extends CrudService<Pet, Long>{

    Owner findByLastName(String lastName);


}
