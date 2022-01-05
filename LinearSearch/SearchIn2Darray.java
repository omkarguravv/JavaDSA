package com.omkar.LinearSearch;


import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
     int[][] arr = {
             {1,9,760,7},
             {77,90,4,10},
             {98,80,76},
             {66}

     }; 
     int target = 66;
//     int[] ans= search(arr,target);
     System.out.println(Arrays.toString(search(arr,target)));

//     int ans2 = searchMin(arr);
        System.out.println(searchMax(arr));

        System.out.println(searchMin(arr));


    }
    //search in 2D array
    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
                
            }
            
        }
        return new int[]{-1,-1};
    }
// search maximum vaue
    static int searchMax(int[][] arr ){

        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max){
                  max = arr[row][col];
                }
            }
        }

        return max;
    }
//min value
    static int searchMin(int[][] arr ){

        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }

        return min;
    }
}
