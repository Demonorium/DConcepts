package ru.demonorium.concepts.function.func;

import java.util.function.Function;
import java.util.function.Predicate;

@FunctionalInterface
public interface FuncA1<R, A1> {
    R call(A1 argument);

    static <R, T> Function<T, R> function(FuncA1<R, T> input) {
        return input::call;
    }

    static <T> Predicate<T> predicate(FuncA1<Boolean, T> input) {
        return input::call;
    }
}
