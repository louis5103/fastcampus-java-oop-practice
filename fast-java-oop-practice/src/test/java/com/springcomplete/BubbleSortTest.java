package com.springcomplete;

import com.springcomplete.sortpackage.BubbleSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다.")
    @Test
    void give_List_WhenExecuting_ThenReturnList(){
        //Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //When
        List<Integer> actual = bubbleSort.sort(List.of(3,2,4,5,1));

        //Then
        assertEquals(List.of(1,2,3,4,5), actual);
    }

}