package ru.demonorium.concepts.data.storage;

import java.util.function.Supplier;

public interface ValueRef<T> extends Supplier<T> {
    static <T> ValueRef<T> get(final T value) {
        return () -> value;
    }
}
