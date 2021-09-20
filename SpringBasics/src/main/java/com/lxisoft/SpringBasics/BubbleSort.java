package com.lxisoft.SpringBasics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortAlgorithm {

    BubbleSort()
    {
        System.out.println("Buble");
    }
    public int[] sort(int[] number)
    {
        return number;
    }
}
