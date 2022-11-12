package ru.demonorium.concepts.function.procv;

@FunctionalInterface
public interface ProcedureAMV<T> {
    void call(T ... args);
}
