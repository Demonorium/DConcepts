package ru.demonorium.concepts.data.storage;

import java.util.function.Supplier;

public interface Container<T> extends Supplier<T> {
    void set(T value);
}
