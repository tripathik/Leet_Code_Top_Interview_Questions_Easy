package org.intelliguru;

import java.util.Stack;

public class ValidParenthesis {
    /**
     Given a string s containing just the characters
     '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

     An input string is valid if:
     Open brackets must be closed by the same type of brackets.
     Open brackets must be closed in the correct order.
     Every close bracket has a corresponding open bracket of the same type.


     Example 1:
     Input: s = "()"
     Output: true

     Example 2:
     Input: s = "()[]{}"
     Output: true
     */

    public boolean validParenthesis(String chars){
        Stack<Character> parenthesisStack = new Stack<>();
        for(char c : chars.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                parenthesisStack.push(c);
            }
            else{
                if(parenthesisStack.isEmpty()){
                    return false;
                }
                char top = parenthesisStack.pop();
                if((c == ')' && top != '(') ||
                        (c=='}' && top != '{') ||
                        (c==']' && top != '[')
                ){
                    return false;
                }
            }
        }
        return parenthesisStack.isEmpty();
    }
}
