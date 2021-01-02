class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // n = number of num2 elements
        // m = number of num1 elements
        int size = m+n;
        int j = 0;
        for (int i = 0; i < size && j < n ; i++){
            nums1[m] = nums2[j];
            j++;
            m++;
        }
        
        Arrays.sort(nums1);
    }
}
