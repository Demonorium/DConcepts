package ru.demonorium.concepts.data.has;

import java.util.Collection;

public interface HasDependents<T> {
    Collection<T> getDependents();
}
