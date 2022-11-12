package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasDependents;

import java.util.Arrays;

public interface WithDependents<T> extends HasDependents<T> {
    void addDependent(T dependent);

    default void addDependents(T ... dependents) {
        Arrays.stream(dependents).forEach(this::addDependent);
    }
}
