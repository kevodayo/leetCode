package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] num = {1,2, 4,2,6,3,3};

        containsDuplicate (num);
        System.out.println(containsDuplicate (num));


    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                System.out.println(nums[i]);
                return true;
            }

        }

        return false;
    }
}
