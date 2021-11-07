package guru.ysy.sfgpetclinic.services.map;

import guru.ysy.sfgpetclinic.model.Vet;
import guru.ysy.sfgpetclinic.services.CrudService;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/7 15:56
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}