package com.springcomplete.sortpackage;

import java.util.ArrayList;
import java.util.List;

// comparable을 상속하는 자료형 T여야 한단
public class BubbleSort<T extends Comparable<T>> implements SortInterface<T> {

    @Override
    public List<T> sort(List<T> input) {
        List<T> output = new ArrayList<>(input);

        for(int i=output.size() -1; i>0; i--){
            for(int j=0; j<i; j++){
                if(output.get(j).compareTo(output.get(j+1))>0){
                    T temp = output.get(j);
                    output.set(j, output.get(j+1));
                    output.set(j+1, temp);
                }
            }
        }
        return output;
    }
}
