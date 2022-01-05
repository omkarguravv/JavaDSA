package com.omkar.LinearSearch;


public class SearchInRange {
    public static void main(String[] args) {
        int[] num = {1,156,4,15,12,123,5,7};
        int target =  1526;
        boolean ans= SearchRange(num ,target, 1,6);
        System.out.println(ans);
    }
    static boolean SearchRange(int[] arr , int target ,int start , int end){
        if (arr.length==0){
            return false;
        }
        for (int index = start; index <= end; index++) {
            if (target== arr[index]){
                return true;
            }


        }
        return false;
    }
}
