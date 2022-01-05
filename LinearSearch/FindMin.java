package com.omkar.LinearSearch;


public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,23,43,-2,4,67,9};
        System.out.println(min(arr));

    }

    static int min(int[] arr){
        int ans = arr[0];
        for (int index = 1; index < arr.length ; index++) {
            if ( arr[index]< ans )
                ans = arr[index];

        }
        return ans;
    }
}
