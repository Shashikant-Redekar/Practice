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

//Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] str) {
        StringBuffer ans = new StringBuffer();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length -1];
        for(int i = 0; i < Math.min(first.length(),last.length()); i++){
            if(first.charAt(i) != last.charAt(i)){
                return ans.toString();
            } else {
                ans.append(first.charAt(i));
            }
        }
        return ans.toString();
    }
}
