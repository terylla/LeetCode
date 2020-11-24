/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/

class Solution {
    public int numIdenticalPairs(int[] nums) {
        // good if num[i] < num[j] && i < j
        // iterate over nums to find match with nums[i]
        // use a hashmap <key,value> ...
        // compare key(nums[i]) to what's in the loop, if match then +1 count
        // if not match, then add the key,value to map
   
        HashMap<Integer,Integer> map = new HashMap<>();      
        int count = 0;
        for (int i = 0; i < nums.length; i++){               
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1); // put as 1, because now if it finds a match, it will add 1
            } else {                          
                int temp = map.get(nums[i]); // pass val of key nums[i] to temp, bc we need to increment it later         
                count += temp;//if map contains key that matches nums[i], then count++  
                map.put(nums[i], temp+1); // so when it loops again, it's the new count, not just 1            
            }                  
         }        
       
        return count;
        
    }
}
