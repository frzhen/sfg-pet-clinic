package guru.ysy.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/1 21:40
 */
public class Owner extends Person {

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
