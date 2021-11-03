package guru.ysy.sfgpetclinic.services;

import guru.ysy.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/3 21:08
 */
public interface VetService {

    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
