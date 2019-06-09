package demo4;

import java.util.Stack;

public class Solution {
    public boolean isValidParentheses(String s) {
        String b = "";
        Boolean isTrue = false;
        for(int i= 0;i<s.length();i++){
            String a = String.valueOf(s.charAt(i));
            String[] c = new String[]{"{","[","(",")","]","}"};
            for(int j=0;j<c.length;j++){
                if(a.equals(c[j])){
                    b += a;
                }
            }
        }
        Stack<String> stack = new Stack<String>();
        for(int x =0;x<b.length();x++){
            String y = String.valueOf(b.charAt(x));
            if(y.equals("{") || y.equals("[")  || y.equals("(") ){
                stack.push(y);
            }else {
                if(y.equals("}")  && (stack.peek().equals("{"))){
                    isTrue = true;
                    stack.pop();
                }else if(y.equals("]")  && (stack.peek().equals("["))){
                    isTrue = true;
                    stack.pop();
                }else if(y.equals(")") && (stack.peek().equals("("))){
                    isTrue = true;
                    stack.pop();
                }else {
                    return isTrue;
                }

            }
        }
        return isTrue;
    }
}
