package org.vmware.braces;

import java.util.Stack;

public class MatchingBraces {
    public static void main(String[] args) {
        String braces = "{[()]}";

        Stack<Character> stack = new Stack<Character>();
        boolean balanced = true;

        for (char ch : braces.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                if (stack.isEmpty()) {
                    balanced = false;
                    break;
                }
                char top = stack.pop();
                if (ch == '}' && top != '{' || ch == ']' && top != '[' || ch == ')' && top != '(') {
                    balanced = false;
                    break;
                }
            }
        }

        if (stack.isEmpty() && balanced)
            System.out.println("Given Pattern " + braces + " is balanced.");
        else
            System.out.println("Given Pattern " + braces + " is NOT balanced.");
    }
}
