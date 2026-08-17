//Largest Odd from String
class Solution {
    public String largestOddNumber(String str) {
        int ind = -1;
        String ret = new String();
        for(int s = str.length()-1; s>=0; s--){
            if((str.charAt(s) - '0') % 2 == 1){
                ind = s;
                break;
            }
        }
        if(ind == -1) System.out.println("");
        int i =0;
        while(str.charAt(i) == '0'){
            i++;
        }
        ret = str.substring(i,ind+1);
        return ret;
    }
}
