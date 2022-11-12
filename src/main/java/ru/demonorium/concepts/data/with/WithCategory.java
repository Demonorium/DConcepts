package ru.demonorium.concepts.data.with;

import ru.demonorium.concepts.data.has.HasCategory;

public interface WithCategory<T> extends HasCategory<T> {
    void setCategory(T category);
}
