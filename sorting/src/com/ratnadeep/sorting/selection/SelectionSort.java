package com.ratnadeep.sorting.selection;

public class SelectionSort {

    public int[] sort(int[] lst) {
        int n = lst.length;

        for (int i = 0; i < n-1; i++)
        {
            int index = i;
            for (int j = i+1; j < n; j++) {
                 if (lst[j] < lst[index]) {
                    index = j;
                 }
            }

            int temp = lst[index];
            lst[index] = lst[i];
            lst[i] = temp;
        }

        return lst;
    }

}