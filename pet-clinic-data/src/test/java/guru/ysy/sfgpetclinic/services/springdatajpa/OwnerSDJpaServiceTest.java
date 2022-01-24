package guru.ysy.sfgpetclinic.services.springdatajpa;

import guru.ysy.sfgpetclinic.model.Owner;
import guru.ysy.sfgpetclinic.repositories.OwnerRepository;
import guru.ysy.sfgpetclinic.repositories.PetRepository;
import guru.ysy.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.annotation.Profile;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

/**
 * Created by zhenrui on 2022/1/18 19:51
 */
@ExtendWith(MockitoExtension.class)
@Profile("spring_data_jpa")
class OwnerSDJpaServiceTest {

    final Long ID = 1L;
    final String LAST_NAME = "Smith";
    final Owner returnOwner= new Owner();
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJpaService ownerSDJpaService;



    @BeforeEach
    void setUp() {
        this.returnOwner.setId(ID);
        this.returnOwner.setLastName(LAST_NAME);
    }

    @Test
    void findAll() {
        Set<Owner> returnOwnerSet = new HashSet<>();
        Owner owner1 = new Owner();
        owner1.setId(1L);

        Owner owner2 = new Owner();
        owner2.setId(2L);

        returnOwnerSet.add(owner1);
        returnOwnerSet.add(owner2);

        //mocking repository findAll() action
        when(ownerRepository.findAll()).thenReturn(returnOwnerSet);

        Set<Owner> owners = ownerSDJpaService.findAll();

        assertNotNull(owners);
        assertEquals(2, owners.size());
        
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(this.returnOwner));

        Owner owner = ownerSDJpaService.findById(ID);

        assertNotNull(owner);
    }

    @Test
    void findByIdNotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());

        Owner owner = ownerSDJpaService.findById(ID);

        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = new Owner();
        ownerToSave.setId(ID);

        //Mocking save() action
        when(ownerRepository.save(any())).thenReturn(this.returnOwner);

        Owner savedOwner = ownerSDJpaService.save(ownerToSave);

        assertNotNull(savedOwner);

        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        ownerSDJpaService.delete(this.returnOwner);

        //default is 1 time
        verify(ownerRepository, times(1)).delete(any());

    }

    @Test
    void deleteById() {
        ownerSDJpaService.deleteById(ID);

        verify(ownerRepository).deleteById(anyLong());
    }

    @Test
    void findByLastName() {

        //mocking repository finaByLastName action
        when(ownerRepository.findByLastName(any())).thenReturn(returnOwner);

        Owner smith = ownerSDJpaService.findByLastName(LAST_NAME);

        assertEquals(LAST_NAME, smith.getLastName());
        // redundant verification to show how to verify repository
        verify(ownerRepository).findByLastName(any());
    }
}