package ru.demonorium.concepts.function.func;

@FunctionalInterface
public interface FuncA3<R, A1, A2, A3> {
    R call(A1 arg1, A2 arg2, A3 arg3);
}
