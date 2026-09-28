package part4.task2;

import java.util.HashMap;

public class MyRepository<T> implements Repository<T> {

    private final HashMap<Integer, T> dataStore = new HashMap<>();
    private int id = 0;

    @Override
    public void save(T data) {
        dataStore.put(id++, data);
    }

    @Override
    public T getById(int id) {
        return dataStore.get(id);
    }

    public void printAll() {
        for (int i =0; i < id; i++) {
            System.out.println("ID: " + i + ", Data: " + dataStore.get(i));
        }
    }
}