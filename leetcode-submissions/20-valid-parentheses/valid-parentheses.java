import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        // Create an ArrayDeque to act as our stack
        Deque<Character> stack = new ArrayDeque<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            
            // Rule 1: If it's an opening bracket, push it
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // Rule 2: If it's a closing bracket
            else {
                // If the stack is empty, there's no matching opening bracket
                if (stack.isEmpty()) {
                    return false;
                }
                
                // Pop the top element and check for a mismatch
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        // Rule 3: The stack must be empty at the end for a valid string
        return stack.isEmpty();
    }
}