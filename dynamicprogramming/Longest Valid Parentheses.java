//https://leetcode.com/problems/longest-valid-parentheses/description/

public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max=0;
        int left = -1;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='(') stack.push(j);            
            else {
                if (stack.isEmpty()) left=j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,j-left);
                    else max=Math.max(max,j-stack.peek());
                }
            }
        }
        return max;
    }
}

/*Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

Example 1:

Input: "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()"
Example 2:

Input: ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()"
*/
