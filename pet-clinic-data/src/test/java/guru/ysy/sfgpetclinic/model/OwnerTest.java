package guru.ysy.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by zhenrui on 2021/11/1 22:30
 */
class OwnerTest {

    final Long Id = 1L;
    final String firstName = "John";
    final String lastName = "Smith";
    final String address = "123 Downy St.";
    final String city = "New York";
    final String telephone = "12564789324";
    final Pet pet1 = new Pet();
    final Pet pet2 = new Pet();

    @Test
    void ownerTest() {
        Owner owner = new Owner();
        owner.setId(Id);
        owner.setLastName(lastName);
        owner.setFirstName(firstName);
        owner.setAddress(address);
        owner.setCity(city);
        owner.setTelephone(telephone);
        Set<Pet> pets = new HashSet<>();
        pets.add(pet1);
        pets.add(pet2);
        owner.setPets(pets);

        assertEquals(Id, owner.getId());
        assertEquals(firstName, owner.getFirstName());
        assertEquals(lastName, owner.getLastName());
        assertEquals(address, owner.getAddress());
        assertEquals(city, owner.getCity());
        assertEquals(telephone, owner.getTelephone());
        assertEquals(pets, owner.getPets());

    }

}