package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasDependencies;

import java.util.Arrays;
import java.util.Collection;

public interface WithDependencies<T> extends HasDependencies<T> {
    void addDependency(T dependency);

    default void addDependencies(T ... dependencies) {
        Arrays.stream(dependencies).forEach(this::addDependency);
    }
}
