package ru.demonorium.concepts.data.has;

import java.util.Collection;

public interface HasDependencies<T> {
    Collection<T> getDependencies();
}
