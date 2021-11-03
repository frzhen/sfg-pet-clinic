package guru.ysy.sfgpetclinic.services;

import guru.ysy.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/3 21:04
 */
public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
