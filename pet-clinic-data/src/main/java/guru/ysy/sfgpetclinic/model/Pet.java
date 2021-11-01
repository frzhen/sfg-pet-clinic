package guru.ysy.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by zhenrui on 2021/11/1 21:40
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public PetType getPerType() {
        return petType;
    }

    public void setPerType(PetType petType) {
        this.petType = petType;
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
