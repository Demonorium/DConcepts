package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasName;

public interface WithName<T> extends HasName<T> {
    void setName(T name);
}
