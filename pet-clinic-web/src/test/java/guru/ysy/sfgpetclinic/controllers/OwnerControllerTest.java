package guru.ysy.sfgpetclinic.controllers;

import guru.ysy.sfgpetclinic.model.Owner;
import guru.ysy.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Created by zhenrui on 2022/1/24 12:39
 */
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController ownerController;

    Set<Owner> owners = new HashSet<>();

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        Owner owner1 = new Owner();
        Owner owner2 = new Owner();
        owner1.setId(1L);
        owner2.setId(2L);

        owners.add(owner1);
        owners.add(owner2);

        mockMvc = MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @ParameterizedTest
    @ValueSource(strings = {"/owners","/owners/", "/owners/index", "/owners/index.html"})
    void listOwners(String uri) throws Exception {
        when(ownerService.findAll()).thenReturn(owners);

            mockMvc.perform(
                    MockMvcRequestBuilders.get(uri))
                    .andExpect(status().isOk())
                    .andExpect(view().name("owners/index"))
                    .andExpect(model().attribute("owners", hasSize(2)));

    }

    @Test
    void findOwners() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/owners/find"))
                .andExpect(status().is(200))
                .andExpect(view().name("notimplemented"));

        //Make sure the not implemented method did not invoke service
        verifyNoInteractions(ownerService);
    }
}