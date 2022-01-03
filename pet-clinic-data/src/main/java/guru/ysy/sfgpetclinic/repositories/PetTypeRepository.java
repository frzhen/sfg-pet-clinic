package guru.ysy.sfgpetclinic.repositories;

import guru.ysy.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by zhenrui on 2022/1/3 11:36
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
