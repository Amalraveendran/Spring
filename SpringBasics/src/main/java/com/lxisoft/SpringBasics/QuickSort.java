package com.lxisoft.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("quick")
public class QuickSort implements SortAlgorithm{
   QuickSort()
   {
       System.out.println("Quick");
   }
    public int[] sort(int[] number)
    {
        return number;
    }
}
