/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progranm3;

/**
 *
 * @author luis camilo
 */
 import java.util.Arrays;
import java.util.Random;
public class Puntu5 {
    public static void main(String[] args) {
       
    
    
        int[] listA = generateRandomSortedArray(2000);
        int[] listB = generateRandomArray(500);

        long startTime, endTime;
        
        // Sequential Search
        startTime = System.nanoTime();
        for (int key : listB) {
            sequentialSearch(listA, key);
        }
        endTime = System.nanoTime();
        long sequentialTime = endTime - startTime;

        // Binary Search
        startTime = System.nanoTime();
        for (int key : listB) {
            binarySearch(listA, key);
        }
        endTime = System.nanoTime();
        long binaryTime = endTime - startTime;

        System.out.println("Tiempo de búsqueda secuencial: " + sequentialTime + " nanosegundos");
        System.out.println("Tiempo de búsqueda binaria: " + binaryTime + " nanosegundos");
    }

    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(2000);
        }
        return array;
    }

    public static int[] generateRandomSortedArray(int size) {
        int[] array = generateRandomArray(size);
        Arrays.sort(array);
        return array;
    }

    public static int sequentialSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}

    

