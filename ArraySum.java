package com.mru.faqs;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        
        // Using a simple loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        System.out.println("Sum of array elements: " + sum);
    }
}