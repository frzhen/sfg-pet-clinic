package guru.ysy.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by zhenrui on 2021/11/6 12:48
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
