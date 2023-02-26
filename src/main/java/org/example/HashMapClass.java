package org.example;

import java.util.HashMap;

public class HashMapClass {

    public static void main(String args[]){
        int[] num = {1,5, 4,2,6,7,3};

        duplicateNumbers (num);
        System.out.println(duplicateNumbers (num));
    }
    public static boolean duplicateNumbers (int num[]){

        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < num.length; i++){
            if (map.containsKey(num[i])) {
                return true;
            }
            map.put(num[i],1);
        }
        return false;
    }
}
