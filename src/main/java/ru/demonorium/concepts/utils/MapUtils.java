package ru.demonorium.concepts.utils;

import ru.demonorium.concepts.data.has.HasCode;
import ru.demonorium.concepts.data.has.HasId;
import ru.demonorium.concepts.data.with.WithCode;
import ru.demonorium.concepts.data.with.WithId;

import java.util.Map;

public class MapUtils {
    private MapUtils() {}

    public static <K, V extends HasId<K>> V write(Map<K, V> map, V value) {
        return map.put(value.getId(), value);
    }

    public static <K, V> V write(Map<K, V> map, HasCode<K> code, V value) {
        return map.put(code.getCode(), value);
    }

    public static <K, V extends HasId<K>> V writeOptional(Map<K, V> map, V value) {
        return map.putIfAbsent(value.getId(), value);
    }

    public static <K, V> V writeOptional(Map<K, V> map, HasCode<K> code, V value) {
        return map.putIfAbsent(code.getCode(), value);
    }
}
