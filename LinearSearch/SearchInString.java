package com.omkar.LinearSearch;


public class SearchInString {
    public static void main(String[] args) {
        String name = "omkar";
        char target = 'l';
       boolean ans= SearchCharacter(name,target);
        System.out.println(ans);
    }

    static boolean SearchCharacter(String name , int target){
        if (name.length() == 0){
            return false;
        }
        for (int index = 0; index < name.length(); index++) {
            if (target== name.charAt(index)){
                return true;
            }


        }
            return false;
    }
}
