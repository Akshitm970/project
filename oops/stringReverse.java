package oops;

import java.util.Stack;

public class stringReverse {
    public static void main(String[] args) {
        String s = "Akshit";
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            stack.push(s.charAt(i));
        }
        System.out.println(stack.size());

        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
        System.out.println(stack.size());

    }
}
