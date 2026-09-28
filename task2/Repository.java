package part4.task2;

public interface Repository <E>{
    void save(E data);
    E getById(int id);
}