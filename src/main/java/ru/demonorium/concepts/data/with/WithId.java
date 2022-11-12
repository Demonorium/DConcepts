package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasId;

public interface WithId<T> extends HasId<T> {
    void setId(T id);
}
