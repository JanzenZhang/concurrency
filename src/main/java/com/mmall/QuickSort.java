package com.mmall;

import java.util.Random;

public class QuickSort {



    public  void sortIntegers(int[] A){


        quicksort(A, 0, A.length -1);

    }

    public  void quicksort(int[] A, int start, int end){

        if (start >= end) {
            return;
        }

        int index = (start+end)/2;

        int pivot = A[index];

        int left = start;

        int right = end;

        while (left<=right){

            while (left<=right && A[left] < pivot){

                left++;

            }

            while (left<=right && A[right] > pivot){
                right--;
            }

            if(left <= right){

                int temp = A[right];
                A[right] = A[left];
                A[left] = temp;

                left++;
                right--;

            }


        }

        quicksort(A, start, right);
        quicksort(A, left, end);


    }

    public static void main(String[] args) {
        int[] A = {6,5,4,3,2,1};
        new QuickSort().sortIntegers(A);
        System.out.println(A);
    }


}
