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

//Isomorphic String
class Solution {
    public boolean isIsomorphic(String a, String b) {
        HashMap<Character,Character> map = new HashMap<>();
        if(a.length() != b.length()){
            System.out.println("false");
        }
        for(int i =0; i< a.length();i++){
            if(!map.containsKey(a.charAt(i))){
                if(!map.containsValue(b.charAt(i))){
                    map.put(a.charAt(i),b.charAt(i));
                }else{
                    return false;
                }
            }else{
                if(map.get(a.charAt(i)) != b.charAt(i)){
                    return false;
                }
            }
        }
        return true;
    }
}
