package com.ratnadeep.sorting.bubble;

public class BubbleSort {

    public static int[] sort(int[] lst) {

        for(int i = 0; i < lst.length; i++) {
            for(int j = i+1; j < lst.length; j++) {
                if(lst[i] > lst[j]) {
                    int temp = lst[i];
                    lst[i] = lst[j];
                    lst[j] = temp;
                }
            }
        }

        return lst;
    }

}
