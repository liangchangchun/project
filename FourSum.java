package com.pplive.ppcloud.service.action.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*        Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d
        = target? Find all unique quadruplets in the array which gives the sum of target.
        Note:
        Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
        The solution set must not contain duplicate quadruplets.*/

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.length == 0) return result;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        int min = nums[0];
//去除太大或太小
        if (4 * min > target || 4 * max < target) return result;
        for (int i = 0; i < nums.length - 3; i++) {
//去除太大
            if (4 * nums[i] > target) return result;
//去除重复
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length - 2; j++) {
//去除太大
                if ((nums[i] + 3 * nums[j]) > target) break;
//去除重复
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int p = j + 1, q = nums.length - 1;
                while (p < q) {
                    int sum = nums[i] + nums[j] + nums[p] + nums[q];
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
//去除重复
                        while (nums[q] == nums[q + 1] && p < q) q--;
                        while (nums[p] == nums[p - 1] && p < q) p++;
                    } else if (sum > target) {
                        q--;
//去除重复
                        while (nums[q] == nums[q + 1] && p < q) q--;
                    } else {
                        p++;
//去除重复
                        while (nums[p] == nums[p - 1] && p < q) p++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSum test111 = new FourSum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> result = test111.fourSum(nums, target);
        System.out.println("result: " + result);
    }
}
