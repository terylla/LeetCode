class Solution {
    public String restoreString(String s, int[] indices) {
            //string s is positioned like the indices
            // so sort the indices and string s will be 
        //arr[i] == indices[i]...so c == 4
        //return String(arr)
        // iterate from 0... need 0 of indices to be s[0]....->s[indices[0]]
       // int indicePosition = 0;
        char[] sortedArray = new char[s.length()];
        
        for (int i = 0; i < indices.length; i++){
            sortedArray[indices[i]] = s.charAt(i); 
        }
        
        //String result = String.valueOf(sortedArray);
       
        return  new String(sortedArray);
    }
}
