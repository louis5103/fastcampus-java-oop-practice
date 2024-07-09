package com.springcomplete;

import com.springcomplete.sortpackage.JavaSort;
import com.springcomplete.sortpackage.SortInterface;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        BubbleSort<String> sort = new BubbleSort<>();
        SortInterface<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}