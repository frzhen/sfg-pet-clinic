package guru.ysy.sfgpetclinic.services.map;

import guru.ysy.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Profile;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by zhenrui on 2022/1/17 14:42
 */
@Profile({"default", "map"})
class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    final Long ownerId = 1L;
    final String lastName = "Smith";

    @BeforeEach
    void setUp() {
        //Mimicking Spring Dependency Injection
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        Owner owner = new Owner();
        owner.setId(ownerId);
        owner.setLastName(lastName);
        ownerMapService.save(owner);
    }

    @Test
    void findByLastName() {
        Owner smith = ownerMapService.findByLastName(lastName);
        assertNotNull(smith);
        assertEquals(ownerId,smith.getId());

        Owner nullOwner = ownerMapService.findByLastName("foo");
        assertNull(nullOwner);
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void saveExistingId() {
        Long Id = 2L;
        Owner owner2 = new Owner();
        owner2.setId(Id);
        Owner savedOwner = ownerMapService.save(owner2);

        assertEquals(Id, savedOwner.getId());


    }

    @Test
    void saveNoId() {
        Owner owner3 = new Owner();
        Owner savedOwner = ownerMapService.save(owner3);

        assertNotNull(savedOwner);
        assertNotNull(savedOwner.getId());

    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(ownerId);

        assertEquals(0, ownerMapService.findAll().size());
    }
}