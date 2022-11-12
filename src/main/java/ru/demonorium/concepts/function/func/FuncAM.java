package ru.demonorium.concepts.function.func;

@FunctionalInterface
public interface FuncAM<R, T> {
    R call(T ... args);
}
