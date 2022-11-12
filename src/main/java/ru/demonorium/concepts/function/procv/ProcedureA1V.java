package ru.demonorium.concepts.function.procv;

import java.util.function.Consumer;

@FunctionalInterface
public interface ProcedureA1V<A1> {
    void call(A1 argument);

    static <T> Consumer<T> consumer(ProcedureA1V<T> procedureA1V) {
        return procedureA1V::call;
    }
}
