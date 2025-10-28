package dao;

import java.util.Optional;

public interface GenericDao<T, ID> {
    void insert(T t);
    Optional<T> findById(ID id);
    void update(T t);
    void deleteById(ID id);
}
