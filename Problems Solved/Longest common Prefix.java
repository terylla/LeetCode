/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

0 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
*/

class Solution {
    public String longestCommonPrefix(String[] strs) {
      
        Arrays.sort(strs);
        StringBuilder prefix = new StringBuilder();
        
        
        if (strs == null || strs.length < 1){
            return "";
        } else {
             
        String last = strs[strs.length-1];
        String first = strs[0];
        
        for (int i = 0; i < first.length(); i++) {
            if(first.charAt(i) == last.charAt(i) && last.length() > i) {
                prefix.append(first.charAt(i));
            } else {
                return prefix.toString();
            }
       }
        }
        
        return prefix.toString();
    }
}

