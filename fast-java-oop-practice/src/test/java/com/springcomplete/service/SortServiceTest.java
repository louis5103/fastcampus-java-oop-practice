package com.springcomplete.service;

import com.springcomplete.sortpackage.BubbleSort;
import com.springcomplete.sortpackage.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
//    private SortService sut = new SortService(new BubbleSort<String>());
    private SortService sut = new SortService(new JavaSort<String>());

    @Test
    void test(){
        //Given

        //when
        List<String> actual = sut.doSort(List.of("3", "2", "1"));

        //Then
        assertEquals(List.of("1", "2", "3"), actual);
    }
}