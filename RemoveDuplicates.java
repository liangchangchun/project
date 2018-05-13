package com.pplive.ppcloud.service.action.internal;

/*    Given a sorted array, remove the duplicates in place such that each element appear only
    once and return the new length.
    Do not allocate extra space for another array, you must do this in place with constant
    memory.
    For example, Given input array nums = [1,1,2],
    Your function should return length = 2, with the first two elements of nums being 1 and 2
    respectively. It doesn't matter what you leave beyond the new length.*/

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int id = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!=nums[id-1]) {
                nums[id++] = nums[i];
                System.out.println("id: "+id);
                System.out.println("i:  "+i);
            }
            System.out.println("nums[i]:  "+nums[i]);
        }
        return id;
    }

    public static void main(String[] args) {
        RemoveDuplicates test111 = new RemoveDuplicates();
        int[] nums = {1,1, 0, -1, 0, -2, 2, 2};
        //int target = 0;
        //List<List<Integer>> result = test111.fourSum(nums, target);

        int result = test111.removeDuplicates(nums);

        System.out.println("result: " + result);
    }
}
