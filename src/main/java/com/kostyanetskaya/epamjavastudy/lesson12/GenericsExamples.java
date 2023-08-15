package com.kostyanetskaya.epamjavastudy.lesson12;

public class GenericsExamples {
}

class DynamicArray<T> {
    private T[] elements;
    private int counter = 0;

    public void addElement(T element) {
        elements[counter] = element;
        counter++;
    }

    public T getElement(int index) {
        return elements[index];
    }

}

class Demo1 {
    public static void main(String[] arg) {
        DynamicArray<Integer> dynArray = new DynamicArray<Integer>();
        dynArray.addElement(Integer.valueOf(10));
        Integer xx = dynArray.getElement(0);
//        dynArray.addElement("Java");
//        Integer yy = dynArray.getElement(1);
    }
}

interface KeyValue<K, V> {
    public K getKey();

    public V getValue();
}

class KeyValueImpl<K, V> implements KeyValue<K, V> {
    private K key;
    private V value;

    public KeyValueImpl(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }
}
