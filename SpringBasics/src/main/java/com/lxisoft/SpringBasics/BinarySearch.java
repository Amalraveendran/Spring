package com.lxisoft.SpringBasics;

public class BinarySearch  {
    private  SortAlgorithm sortAlgorithm;
    public  BinarySearch(SortAlgorithm sortAlgorithm)
    {   super();
        this.sortAlgorithm=sortAlgorithm;
    }
    public int binarySearch(int[] numbers,int numberToBeSearched)
    {
        int[] sortedNumbers=sortAlgorithm.sort(numbers);
        System.out.println("-----------");
        return  7;
    }


}
