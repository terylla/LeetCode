class Solution {
    public int numJewelsInStones(String J, String S) {
    
      // let's use  public int indexOf(String str) method to return the character from S
        for (char i : S.toCharArray()){         
          if (J.indexOf(i) > -1){ // indexOf  returns the  i from String S
             count++;
            }
        }
    

//         //put the charactesr in an array then return size of  that array?
//         // OR return the characters that match and then count 
        
        return count;
    }
}
