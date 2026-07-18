class Solution {
    public boolean isPalindrome(String s) {
        String newString = s.toLowerCase();
        StringBuilder string = new StringBuilder(newString.length());
        
        for (int i = 0; i < newString.length(); i++) {
            char c = newString.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                string.append(c);
            }
        }
        
        
        String forwardString = string.toString();
        
        
        String reversedString = string.reverse().toString();
        
        
        return forwardString.equals(reversedString);
    }
}