package ru.demonorium.concepts.function.procv;

import java.util.function.BiConsumer;

@FunctionalInterface
public interface ProcedureA2V<A1, A2> {
    void call(A1 arg1, A2 arg2);

    static <T1, T2> BiConsumer<T1, T2> consumer(ProcedureA2V<T1, T2> procedureA1V) {
        return procedureA1V::call;
    }
}
