package ru.demonorium.concepts.misc;

import java.util.Map;

public interface UtilPair<T1, T2> extends Map.Entry<T1, T2> {
    T1 getLeft();
    T2 getRight();

    void setLeft(T1 left);
    void setRight(T2 right);

    @Override
    default T2 setValue(T2 t2) {
        T2 right = getRight();
        setRight(t2);
        return right;
    }

    default T1 setKey(T1 t1) {
        T1 left = getLeft();
        setLeft(t1);
        return left;
    }

    @Override
    default T1 getKey() {
        return getLeft();
    }

    @Override
    default T2 getValue() {
        return getRight();
    }
}
