package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // creare array
        int[] arr = new int[10];
        // initializare cu 10 pentru toate valorile
        Arrays.fill(arr, 10);
        // printare valori
        for (var i : arr) {
            System.out.println(i);
        }
    }
}
