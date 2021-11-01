package guru.ysy.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

/**
 * Created by zhenrui on 2021/11/1 21:49
 */
class PersonTest {

    @Test
    public void testPerson(){
        Person person = new Person();
        person.setFirstName("Fred");
        person.setLastName("Zhen");
        System.out.println("The Person is " + person.getFirstName() + " " +  person.getLastName());
    }

}