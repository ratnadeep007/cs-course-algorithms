package com.ratnadeep.searching;

import com.ratnadeep.searching.Binary.BinarySearch;
import com.ratnadeep.searching.LinearSearch.LinearSearch;

public class Searching {

    public static void main(String[] args) {

        int[] lst = { 2, 5, 6, 7, 8, 10 };

//        LinearSearch search = new LinearSearch();
        BinarySearch search = new BinarySearch();
        search.search(lst, 6);

    }
}
