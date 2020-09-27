package Service;

import java.util.List;

public interface Manager<T> {
    void add(T object);
    void update (int id, T object);
    void delete (int id);
    void display ();

    T findById(int id);
    T findByName(String name);
    List<T> findAll();
}
