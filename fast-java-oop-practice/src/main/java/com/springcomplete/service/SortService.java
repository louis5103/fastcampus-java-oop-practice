package com.springcomplete.service;

import com.springcomplete.sortpackage.JavaSort;
import com.springcomplete.sortpackage.SortInterface;

import java.util.List;

public class SortService {
    // 어떤 구현체를 사용할 것인지 알 수 없음.
    private SortInterface<String> sort;

    public SortService(SortInterface<String> sort){
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
