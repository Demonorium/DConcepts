package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasCode;

public interface WithCode<T> extends HasCode<T> {
    void setCode(T code);
}
