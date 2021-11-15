package guru.ysy.sfgpetclinic.services.map;

import guru.ysy.sfgpetclinic.model.Specialty;
import guru.ysy.sfgpetclinic.model.Vet;
import guru.ysy.sfgpetclinic.services.SpecialtyService;
import guru.ysy.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/7 15:56
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
        if (object.getSpecialties().size() >0) {
            object.getSpecialties().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
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
