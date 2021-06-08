package letsjava.chapter4.s06.mylist;

import java.util.*;

/**
 * @author ranlay.su
 * @date 2021-06-05 18:46
 */
public class MyArrayList<T> implements List<T> {
    private Object[] elements;
    private int curr;

    public MyArrayList() {
        elements = new Object[16];
        curr = 0;
    }

    @Override
    public int size() {
        return curr;
    }

    @Override
    public boolean isEmpty() {
        return curr == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object ele : elements) {
            if (Objects.equals(ele, o)) {
                return true;
            }
        }

        return false;
    }

    // >> TODO 实现 Iterable 接口里定义的 iterator接口
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int pointer = 0;

            @Override
            public boolean hasNext() {
                return pointer < size();
            }

            @SuppressWarnings("unchecked")
            @Override
            public T next() {
                return (T) elements[pointer++];
            }
        };
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }

    // >> TODO 使用泛型后，在实现接口的时候，用泛型替代原来的Object
    @Override
    public boolean add(T t) {
        if (curr == elements.length - 1) {
            elements = new Object[elements.length * 2];
        }
        elements[curr] = t;
        curr++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        curr = 0;
    }

    // >> TODO 使用泛型之后，在实现接口的时候，用泛型代替原来的Object
    @SuppressWarnings("unchecked")
    @Override
    public T get(int index) {
        if (index > curr || index < 0) {
            throw new IndexOutOfBoundsException("out of bound " + curr + " for " + index);
        }

        return (T) elements[index];
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
