package guru.ysy.sfgpetclinic.services;

import guru.ysy.sfgpetclinic.model.Owner;

/**
 * Created by zhenrui on 2021/11/3 21:04
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
