package service;

import java.util.List;

public interface GeneralService<T> {
    List<T> findAll();
    T findById(int id);
    List<T> findByName(String name);
    void save(T t);
    void edit(int id,T t);
    void delete(int id);
}
