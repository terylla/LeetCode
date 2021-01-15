class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count[] = new int[101]; // to count nums[i]
        int ans[] = new int[nums.length];
        //int size = nums.length;
        
        // use counting sort 
        
        //set the nums[i] itself as an index, and value of index is its count
        for (int i = 0; i < nums.length; i++){ // count[8] = 1, count[1] = 1, count[2] = 1, count[2] = 2, count[3] = 1
            count[nums[i]]++; //count[nums[i]] += 1;
        }
        
        // add the previous value to current value of the` index (remember: the index = elements of nums, its value is 0 if the index number doesn't exist within nums' elements)
        for (int i = 1; i < 101; i++){
            count[i] += count[i-1]; // count[1] = 1 + count[1-1] = count[0] => 1 + 0
        }
        
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){ // so if nums[i] == 0, there's nothing to count, set count of nums[i] = 0 then
                ans[i] = 0;
            } else { 
                ans[i] = count[nums[i]-1];
                //otherwise, ans[i] equals the count index (nums element) minus 1 
                
                // count array: count[0,1,2,1,0,0,0,1]
                // count array after 2nd for loop: count[0,1,3,4,4,4,4,5]
                //visual example: 
                //count[nums[0]-1] = count[8-1] = count[7] = 4
                //count[nums[1]-1] = count[1-1] = count[0] = 0
                //count[nums[2]-1] = count[2-1] = count[1] = 1
                //count[nums[3]-1] = count[2-1] = count[1] = 1
                //count[nums[4]-1] = count[3-1] = count[2] = 3
            }
        }
        
        return ans;
        
    }
}
