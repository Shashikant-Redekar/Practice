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

//Rotation Stirng 1 solution 
class Solution {
    public boolean rotateString(String a, String b) {
                int s = a.length();
        int t = b.length();
        if (s != t){
            return false;
        }
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == b.charAt(0)){
                if((a.substring(i) + a.substring(0,i)).equals(b)){
                    return true;
                }
            }
        }
                    return false;
    }
}

//Rotation String 2 Solution
class Solution {
    public boolean rotateString(String a, String b) {
                int s = a.length();
        int t = b.length();
        if (s != t){
            return false;
        }
        String str = a + a;
        if(str.contains(b)){
            return true;
        }
        return false;
    }
}

//Valid Anagram 1
class Solution {
    public boolean isAnagram(String a, String b) {
         int s = a.length();
        int t = b.length();
        if (s != t){
            return false;
        }
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);
        for(int i = 0; i< s; i++){
            if(c[i] != d[i]){
                return false;
            }
        }
        return true;
    }
}

//Valid Anagram 2
class Solution {
    public boolean isAnagram(String a, String b) {
         int s = a.length();
        int t = b.length();
        if (s != t){
            return false;
        }
        int[] index = new int[26];
        for(int i = 0; i < s; i++){
            index[a.charAt(i) - 'a']++;
            index[b.charAt(i) - 'a']--;
        }
        for(int i = 0; i< 26; i++){
            if(index[i] != 0){
                return false;
            }
        }
        return true;
    }
}

//Reverse a String 
class Solution {
    public String reverseWords(String a) {
                if(a.equals(' '))
            System.out.println(' ');
                    a = a.strip();  //sanitization
        a = a.replaceAll("\\s+", " ");
        StringBuffer str = new StringBuffer();
        int ref = 0;
        for(int i = a.length()-1; i>=0; i--){
            if((a.charAt(i) == ' ' && ref == 0)|| (i == 0 && ref == 0)){
                if(i != 0) {
                    str.append(a.substring(i+1));
                }else{
                    str.append(a.substring(i));
                }
                ref = i;
            }else if (a.charAt(i) == ' ' || i == 0){
                if(i != 0) {
                    str.append(a.substring(i, ref));
                }else{
                    str.append(' ');
                    str.append(a.substring(i, ref));
                }
                ref = i;
            }
        }
        return str.toString();
    }
}

//remove outermost paranthesis
class Solution {
    public String removeOuterParentheses(String a) {
                StringBuffer str = new StringBuffer();
        int ref = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == '(' && ref == 0){
                ref++;
            }else if (a.charAt(i) == '('){
                str.append(a.charAt(i));
                ref++;
            }else if (a.charAt(i) == ')' && ref != 1){
                str.append(a.charAt(i));
                ref--;
            } else if (a.charAt(i) == ')' && ref == 1){
                ref--;
            }
        }
        return str.toString();
    }
}
