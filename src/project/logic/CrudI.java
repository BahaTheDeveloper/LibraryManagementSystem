package project.logic;

import java.util.List;

public interface CrudI<T> {
    List<T> search(T t);
    boolean delete(T t);
    boolean add(T t);
}
