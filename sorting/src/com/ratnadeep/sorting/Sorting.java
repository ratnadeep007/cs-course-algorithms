package com.ratnadeep.sorting;

import com.ratnadeep.sorting.bubble.BubbleSort;
import com.ratnadeep.sorting.merge.MergeSort;
import com.ratnadeep.sorting.selection.SelectionSort;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

        int[] lst = { 4,9,7,1,3,6,5 };
        System.out.println(Arrays.toString(lst));

        MergeSort sorting = new MergeSort();
        int[] newl = sorting.sort(lst);


        System.out.println(Arrays.toString(newl));

    }

}