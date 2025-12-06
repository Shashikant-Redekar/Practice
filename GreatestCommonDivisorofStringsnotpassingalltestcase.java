// For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).

// Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

// Example 1:

// Input: str1 = "ABCABC", str2 = "ABC"
// Output: "ABC"
// Example 2:

// Input: str1 = "ABABAB", str2 = "ABAB"
// Output: "AB"
// Example 3:

// Input: str1 = "LEET", str2 = "CODE"
// Output: ""
 

// Constraints:

// 1 <= str1.length, str2.length <= 1000
// // str1 and str2 consist of English uppercase letters.

class Solution {
    public String gcdOfStrings(String str1, String str2) {
                   if((str1+str2).equals((str2+str1))){
                char ch = str1.charAt(0);
                String str3 = str1 + str2;
                StringBuffer str = new StringBuffer();
                str.append(str3.charAt(0));
                int i=1;
                while (i < str3.length()){
                    if( ch == str3.charAt(i)){
                        break;
                    }else {
                        str.append(str3.charAt(i));
                        i++;
                    }
                }
                return String.valueOf(str);
            }else
            return "";
    }
}
