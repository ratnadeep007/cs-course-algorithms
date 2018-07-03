package com.ratnadeep.searching.Binary;

import com.ratnadeep.searching.Sort.MergeSort;

import java.util.Arrays;

public class BinarySearch {

    int key;

    public void search(int[] lst, int key) {
        int length = lst.length;
        this.key = key;

        MergeSort sorting = new MergeSort();
        int[] sorttedArray = sorting.sort(lst);

        BinarySearch(lst, 0, length);
    }

    void BinarySearch(int[] array, int l, int h) {
        if(l > h) {
            return;
        }

        int middle = (l+h)/2;

        if(key == array[middle]) {
            System.out.println("Found at: " + (middle+1));
        }

        if(key < array[middle]) {
            BinarySearch(array, l, middle-1);
        } else {
            BinarySearch(array, middle+1, h);
        }
    }

}
