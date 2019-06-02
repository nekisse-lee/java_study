package java8_3.chap11.my_vector;

import java.util.Arrays;

public class MyVector {
    private Object[] objArr;
    private int size;


    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다.");
        }
        objArr = new Object[capacity];
    }

    MyVector() {
        this(10);
    }


    int size() {
        return this.size;
    }

    int capacity() {
        return this.objArr.length;
    }

    boolean isEmpty() {
//        return this.size  () == 0 ? true : false;
        return this.size() == 0;
    }

    void clear() {
        for (int i = 0; i < this.objArr.length; i++) {
            this.objArr[i] = null;
            this.size = 0;
        }
    }

    Object get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("범위를 벗어남");
        }
        return this.objArr[index];
    }

    int indexOf(Object object) {
        for (int i = 0; i < this.size; i++)
            if (objArr[i].equals(object))
                return i;

        return -1;
    }

    void setCapacity(int capacity) {
        Object[] tmp = new Object[capacity];
        System.arraycopy(objArr, 0, tmp, 0, Math.min(size, capacity));
        objArr = tmp;
    }

    void ensureCapacity(int minCapacity) {
        if (minCapacity > objArr.length) {
            setCapacity(minCapacity);
        }
    }


    Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("범위를 벗어남");
        }

        Object oldObj = objArr[index];

        if (index != size - 1) {
            System.arraycopy(objArr, index + 1, objArr, index, size - 1 - index);
        }
        objArr[size - 1] = null;
        size--;

        return oldObj;
    }

    boolean add(Object obj) {
        ensureCapacity(size + 1);
        objArr[size] = obj;
        size++;

        return true;
    }

    @Override
    public String toString() {
        String tmp = "[";
        for (int i = 0; i < size; i++) {
            tmp += objArr[i] + ", ";
        }
        return tmp + "]";
    }
}
