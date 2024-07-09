package com.springcomplete.sortpackage;

import java.util.List;

public interface SortInterface <T extends Comparable<T>> {
    List<T> sort(List<T> list);
}
