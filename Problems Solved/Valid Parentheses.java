/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
Example 4:

Input: s = "([)]"
Output: false
Example 5:

Input: s = "{[]}"
Output: true
 

Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] characters = s.toCharArray();
        
        if (characters.length % 2 == 1){
            return false;
        }
        
        for (char i : characters){
            if (i == '('){
                stack.push(')');
            } else if (i == '{'){
                stack.push('}');
            } else if (i == '['){
                stack.push(']');
            } else
        
            if (stack.isEmpty() || stack.pop() != i) {
                return false;
            } 
         }
        
        return stack.isEmpty();
    }
}