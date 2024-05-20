/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgorithms;
import java.util.Arrays;
/**
 *
 * @author Asus
 */
public class insertionsort {
         public static void main (String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString (array));
        insertionSort(array);
        System.out.println("Sorted array:" + Arrays.toString (array));
}
        static void insertionSort(int[] array) {
            int n = array.length;
            for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j= i - 1;
            }
        }
}