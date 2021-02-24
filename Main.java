package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size; int target;
        int[] an = new int[2];
        System.out.println("Enter the size of the array");
        size = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[size];
        System.out.println("Enter the elements into the array");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target");
        target = sc.nextInt();
        an = twoSum(arr,target);
        System.out.println("Ans is : " + Arrays.toString(an));
    }

    public static int[] twoSum(int[] nums, int target){
        int[] ans = new int[2];
        for(int i = 0;i< nums.length - 1;i++){
            for(int j = i+1;j< nums.length; j++ ){
                if(nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

}
