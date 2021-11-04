package guru.ysy.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Created by zhenrui on 2021/11/4 09:04
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
