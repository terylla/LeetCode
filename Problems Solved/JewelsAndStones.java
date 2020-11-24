/*
You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3
Example 2:

Input: J = "z", S = "ZZ"
Output: 0
Note:

S and J will consist of letters and have length at most 50.
The characters in J are distinct.
*/

class Solution {
    public int numJewelsInStones(String J, String S) {
    
      // let's use  public int indexOf(String str) method to return the character from S
        for (char i : S.toCharArray()){         
          if (J.indexOf(i) > -1){ // indexOf  returns the  i from String S ...and -1 every loop til there's no more char left
             count++;
            }
        }
    
        
        return count;
    }
}
