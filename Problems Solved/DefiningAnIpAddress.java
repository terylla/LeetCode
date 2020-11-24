class Solution {
    public String defangIPaddr(String address) {
//         for (int i = 0; i < address.length(); i++){
//             if (address.charAt(i) == "."){
                
//             }
//         }
        address = address.replace(".", "[.]");
        return address;
    }
}
