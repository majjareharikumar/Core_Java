package DSA_Leet_Code.String;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' ||ch=='{' || ch=='['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')' && top !='(') || (ch=='}' && top!='{') || (ch==']' && top!='[')){
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("[{()}]"));
        System.out.println(isValid("[]{})"));
        System.out.println(isValid("{(}"));

    }
}

//Use a Stack because brackets must close in reverse order of opening.
//Push all opening brackets (, {, [ into the stack.
//When a closing bracket appears, pop the top element from the stack.
//Check whether the popped bracket matches the current closing bracket.
//If the stack is empty or brackets do not match, return false.
//After processing all characters, the stack must be empty.
//If the stack is empty, all brackets are balanced, so return true.
//Time Complexity: O(n), Space Complexity: O(n).
