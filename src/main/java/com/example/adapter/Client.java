package com.example.adapter;

public class Client
{
    /**
     * This is an empty implementation of the adapter for presentation purposes and does not actually work
     *
     * Client cannot call NumberSorter to sort the numbers as it only has an array of numbers.
     *
     * So it creates an adapter (which implements the same interface as the NumberSorter) and calls sort on it. It then
     * converts the array to a list and calls the NumberSorter.
     *
     * @param args
     */
    public static void main(String[] args)
    {
        int[] numbers = new int[]{34, 2, 4, 12, 1};
        Sorter sorter = new SortListAdapter();
        sorter.sort(numbers);
    }
}
