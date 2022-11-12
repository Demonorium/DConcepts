package ru.demonorium.concepts.utils;

public interface TypeRef<T> {
    static <T> TypeRef<T> of(Class<T> type) {
        return new TypeRef<>() {};
    }
}
