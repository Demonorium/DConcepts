package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasDescription;

public interface WithDescription<T> extends HasDescription<T> {
    void setDescription(T description);
}
