package com.pplive.ppcloud.service.action.internal.wscdn;

public class OrderedArrayToBST {
	
	//77 Convert Sorted Array to Binary Search Tree

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode orderedArrayToBST(int[] number) {
        if (number.length == 0)
            return null;
        return orderedArrayToBST(number, 0, number.length - 1);
    }

    public TreeNode orderedArrayToBST(int[] number, int start, int end) {
        if (start > end)
            return null;
        int middle = (start + end) / 2;
        System.out.println("middle: "+middle);
        TreeNode root = new TreeNode(number[middle]);
        root.left = orderedArrayToBST(number, start, middle - 1);
        root.right = orderedArrayToBST(number, middle + 1, end);
        return root;
    }

    //****************************************************************************************************************************************************************
    public static void main (String[] args){
        OrderedArrayToBST test111 = new OrderedArrayToBST();
        int[] number = {1,2,3,4,5,6,7};
        TreeNode treeNode = test111.orderedArrayToBST(number);
        System.out.println("treeNode.val: "+treeNode.val);
    }
}
