// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

// Return the merged string.

 

// Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r
// Example 2:

// Input: word1 = "ab", word2 = "pqrs"
// Output: "apbqrs"
// Explanation: Notice that as word2 is longer, "rs" is appended to the end.
// word1:  a   b 
// word2:    p   q   r   s
// merged: a p b q   r   s
// Example 3:

// Input: word1 = "abcd", word2 = "pq"
// Output: "apbqcd"
// Explanation: Notice that as word1 is longer, "cd" is appended to the end.
// word1:  a   b   c   d
// word2:    p   q 
// merged: a p b q c   d
 

// Constraints:

// 1 <= word1.length, word2.length <= 100
// word1 and word2 consist of lowercase English letters.


class Solution {
    public String mergeAlternately(String word1, String word2) {
                String word = "";
        int len = 0;
        int str = 0;
        //int len = (word1.length() >= word2.length())? word2.length() : word1.length();
        if (word1.length() >= word2.length()){
            len = word2.length();
            str = 2;
        }else {
            len = word1.length();
            str = 1;
        }
        for( int i = 0; i < len; i++ ){
            word = word + word1.charAt(i);
            word = word + word2.charAt(i);
        }
        if ( str == 2){
                word = word + remaining(word1, len);
        }else{
            word = word + remaining(word2, len);
        }
        return word;
    }
    public String remaining(String longer,int leng){
        String str = "";
        for (int i = leng; i < longer.length(); i++){
            str = str + longer.charAt(i);
        }
        return str;
    }
}
