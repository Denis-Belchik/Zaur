package generics;

import java.util.Arrays;

public class Generics<T> {

    private int size = 0;

    private Object[] list;

    public Generics() {
        list = new Object[10];
    }

    public Generics(int value) {
        if (value <= 0)
            throw new RuntimeException("INDEX(((");
        list = new Object[value];
    }

    public T add(T val, int index) {
        if (index >= size)
            throw new RuntimeException("INDEX(((");
        list[index] = val;
        return val;
    }

    public T add(T val) {
        if (size == list.length) {
            list = resize();
        }
        list[size] = val;
        size++;
        return val;
    }

    public int size() {
        return size;
    }

    private Object[] resize() {
        int newSize = (int) (size * 1.5) + 1;
        return Arrays.copyOf(list, newSize);
    }

    public T get(int index) {
        if (index >= size)
            throw new RuntimeException("INDEX(((");
        return (T) list[index];
    }

    public int indexOf(T val) {
        if (val == null)
            return -1;
        for (int i = 0; i < size; i++) {
            if (val.equals(list[i]))
                return i;
        }
        return -1;
    }

    public boolean contains(T val) {
        return indexOf(val) != -1;
    }

    public T remove(int index) {
        if (index > size || index < 0)
            throw new RuntimeException("INDEX(((");
        resizeRem(index);
        list[size] = null;
        size--;
        return null;
    }

    private void resizeRem(int index) {
        System.arraycopy(list, index + 1, list, index, size - index);
    }

}
