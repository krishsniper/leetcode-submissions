class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        while(i != s.length/2){
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
            i++;
        }
    }
}