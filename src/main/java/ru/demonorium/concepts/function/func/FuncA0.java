package ru.demonorium.concepts.function.func;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

@FunctionalInterface
public interface FuncA0<R> {
    R call();

    static <T> Supplier<T> supplier(FuncA0<T> input) {
        return input::call;
    }

    static <T> Callable<T> callable(FuncA0<T> input) {
        return input::call;
    }
}
