package guru.ysy.sfgpetclinic.model;

/**
 * Created by zhenrui on 2021/11/15 11:13
 */
public class Specialty extends BaseEntity{

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
