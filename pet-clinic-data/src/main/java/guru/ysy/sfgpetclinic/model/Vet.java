package guru.ysy.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/1 21:39
 */
public class Vet extends Person {
    private Set<Specialty> specialties;

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
