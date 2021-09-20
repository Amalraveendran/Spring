package com.lxisoft.SpringBasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch  {
    @Autowired
    //@Qualifier("quick")
    private  SortAlgorithm sortAlgorithm;
   /* public  BinarySearch(SortAlgorithm sortAlgorithm)
    {   super();
        this.sortAlgorithm=sortAlgorithm;
    }*/

    public void setSortAlgorithm(SortAlgorithm sortAlgorithm)
    {
        this.sortAlgorithm=sortAlgorithm;
    }
    public int binarySearch(int[] numbers,int numberToBeSearched)
    {
        int[] sortedNumbers=sortAlgorithm.sort(numbers);
        System.out.println("-----------");
        return  7;
    }


}
