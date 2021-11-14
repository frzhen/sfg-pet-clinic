package guru.ysy.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * Created by zhenrui on 2021/11/15 00:43
 */
public class Visit extends BaseEntity{

    private LocalDate date;
    private String decription;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDecription() {
        return decription;
    }

    public void setDecription(String decription) {
        this.decription = decription;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
