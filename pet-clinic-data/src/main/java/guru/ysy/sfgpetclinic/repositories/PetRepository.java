package guru.ysy.sfgpetclinic.repositories;

import guru.ysy.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhenrui on 2022/1/3 11:35
 */
public interface PetRepository extends CrudRepository<Pet, Long> {

    //TODO: create find by owner last name, first name, and by full name

}
