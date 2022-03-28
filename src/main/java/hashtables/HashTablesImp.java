package hashtables;

import example.Hello;

import java.util.Arrays;
import java.util.Collections;

public class HashTablesImp<T> {

    private T[] hashtable;

    public HashTablesImp() {
        hashtable = (T[]) new Object[10];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    private void put(String key, T obj) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("Data already present");
        } else {
            hashtable[hashedKey] = obj;
        }
    }

    private T get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    @Override
    public String toString() {
        return "HashTablesImp{" +
                "hashtable=" + Arrays.toString(hashtable) +
                '}';
    }

    public static void main(String[] args) {
        HashTablesImp<String> stringHashTables = new HashTablesImp<>();
        stringHashTables.put("Hello", "John");
        stringHashTables.put("Hello!", "Jane");
        stringHashTables.put("Hello!!", "Jack");
        stringHashTables.put("Hello", "Joe");
        stringHashTables.put("Hello!!!", "Joeys");
        System.out.println(stringHashTables);
        System.out.println(stringHashTables.get("Hello"));
    }
}
