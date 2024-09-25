/*
Given an integer x, return true if x is a palindrome and false otherwise.
    Example 1:
    Input: x = 121
    Output: true

    Example 2:
    Input: x = -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-.

    Example 3:
    Input: x = 10
    Output: false

Constraints:
        -231 <= x <= 231 - 1

Follow up: Could you solve it without converting the integer to a string?
*/

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }
}