package com.example.adapter;

import java.util.ArrayList;
import java.util.List;

public class SortListAdapter implements Sorter
{
    public int[] sort(int[] numbers)
    {
        //convert the array to a List
        List<Integer> numberList = new ArrayList<Integer>();
        //call the adapter
        NumberSorter sorter = new NumberSorter();
        numberList = sorter.sort(numberList);
        //convert the list back to an array and return
        int[] sortedNumbers = new int[0];
        return sortedNumbers;
    }
}
