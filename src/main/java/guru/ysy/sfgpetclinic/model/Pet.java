package guru.ysy.sfgpetclinic.model;

import org.aspectj.weaver.patterns.PerTypeWithin;

import java.time.LocalDate;

/**
 * Created by zhenrui on 2021/11/1 21:40
 */
public class Pet {
    private PerType perType;
    private Owner owner;
    private LocalDate birthDate;

    public PerType getPerType() {
        return perType;
    }

    public void setPerType(PerType perType) {
        this.perType = perType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
