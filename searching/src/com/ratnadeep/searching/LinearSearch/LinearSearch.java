package com.ratnadeep.searching.LinearSearch;

public class LinearSearch {

    public static void search(int[] lst, int key) {
        int length = lst.length;

        for(int i = 0; i < length; i++) {
            if(lst[i] == key) {
                System.out.println("Found at index:"+(i+1));
            }
        }


        System.out.println("Number not found in array");
    }

}
