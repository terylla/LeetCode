/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0
 

Constraints:

0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
*/



class Solution {
    public int strStr(String haystack, String needle) {
//         if (needle == null || haystack == null) return 0;        
//         if (haystack.indexOf(needle) == 1) return haystack.indexOf(needle);           
//         return haystack.indexOf(needle);
        if (needle == null) return 0;
        if (haystack == null) return -1; 
        int j = 0;  
        int i = 0;
        while (i < haystack.length() && j < needle.length()){          
            if (haystack.charAt(i) == needle.charAt(j)){  //if a match is found
                j++; //goes to the next char in needle // 1 // 2...2 is length of needle "ll"..exits while loop
                i++; // goes to the next char in haystack // matched: 2+1 //matched: 3+1 , i is now 4 regardless 
            } else {
                i = i-j+1; // goes to the next char in haystack either way
                //i-j+1 because we need to loop from the char i+1, the char after the first char i that matched char j
                j = 0; //reset j to 0, until it finds match (above if condition)
            }                      
        }       
            
             //after it's done looping every character in needle, 
        if (j == needle.length()){
                return i-j;  // 4 - 2
                //i-j because i finished looping at 1 char after the last needle char
                // ..so we subtract j to get back the first position where haystack.charAt(i) == needle.charAt(j)
            }
       
        
      
        return -1;
    }
}

