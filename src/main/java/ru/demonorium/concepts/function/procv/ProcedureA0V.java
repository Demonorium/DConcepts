package ru.demonorium.concepts.function.procv;

@FunctionalInterface
public interface ProcedureA0V {
    void call();

    static Runnable runnable(ProcedureA0V procedureA0V) {
        return procedureA0V::call;
    }
}
