package Lesson26;

public class SimpleMap {

    private Object[] arr;

    public SimpleMap() {
        arr = new Object[16];

    }

    public void put(String key, Object value) {
        int indexOfBucket = indexOf(key);
        arr[indexOfBucket] = value;

    }

    public Object get(String key) {
        int indexOfBucket = indexOf(key);
        return arr[indexOfBucket];
    }

    private int indexOf(String key) {
        int hashcode = key.hashCode();
        return Math.abs(hashcode % arr.length);

    }
}


