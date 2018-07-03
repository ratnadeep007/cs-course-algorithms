package com.ratnadeep.searching.Sort;

public class MergeSort {

    private int[] result;
    private int[] array;
    private int length;

    public int[] sort(int[] lst) {
        this.array = lst;
        this.length = lst.length;
        this.result = new int[length];
        MergeSort(0, length -1 );
        return this.array;
    }

    private void MergeSort(int l, int h) {
        if(l < h) {
            int m = l + (h - l) / 2 ;
            MergeSort(l, m);
            MergeSort(m+1, h);
            Merge(l, m, h);
        }
    }

    private void Merge(int l, int m, int h) {
        for(int i = l; i <= h; i++) {
            result[i] = array[i];
        }
        int i = l;
        int j = m+1;
        int k = l;
        while(i <= m && j <= h) {
            if(result[i] <= result[j]) {
                array[k] = result[i++];
            } else {
                array[k] = result[j++];
            }
            k++;
        }
        while(i <= m) {
            array[k] = result[i];
            k++;
            i++;
        }
    }

}
