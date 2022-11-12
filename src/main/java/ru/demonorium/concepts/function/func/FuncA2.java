package ru.demonorium.concepts.function.func;

import java.util.Comparator;
import java.util.function.BiFunction;

@FunctionalInterface
public interface FuncA2<R, A1, A2> {
    R call(A1 arg1, A2 arg2);

    static <R, T1, T2> BiFunction<T1, T2, R> function(FuncA2<R, T1, T2> input) {
        return input::call;
    }

    static <T> Comparator<T> comparator(FuncA2<Integer, T, T> input) {
        return input::call;
    }
}
