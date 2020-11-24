class Solution {
    public int maxPower(String s) {
        int count = 1;
        int totalCount = 0;
        int length = s.length();

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1){
            return 1;
        }

        if (s.length() > 1){
            for (int i = 0; i < length; i++){
                if (i < length -1 && s.charAt(i) == (s.charAt(i+1))){
                    count++;
                } else {
                    count = 1;
                }

                if (totalCount < count){
                    totalCount= count;
                }
            }
        }
        return totalCount;
    }
}