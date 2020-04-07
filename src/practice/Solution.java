package practice;

import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        char ch; int i;
        public Node (char c, int x) {
            ch = c;
            i = x;
        }
    }
    public static void main(String[] args) throws Exception {
        
        int T = 1;
        
        while (T-- > 0) {
            int n = 14;
            String s = "[[]][[][[]]][]";
            
            Stack<Node> stack = new Stack<Node>();
            int i = 0;
            int prev = -1;
            int result = 0;
            boolean flag = false;
            
            while (i<n) {
                if (s.charAt(i) == '[') {
                    if (!stack.isEmpty()) {
                        Node node = stack.peek();
                        node.i += 1;
                    }
                    else {
                        if (flag && prev != -1) {
                            flag = false;
                            prev = -1;
                            result++;
                        }
                    }
                    stack.push(new Node('[', 0));
                }
                else {
                    Node node = stack.peek();
                    
                    if (node.i == 0)
                        stack.pop();
                    else {
                        if (prev == -1) {
                            prev = node.i;
                            flag = true;
                            stack.pop();
                        }
                        else {
                            if (node.i != prev) {
                                flag = false;
                            }
                            else
                            	result++;
                            stack.pop();
                        }
                    }
                }
                i++;
            }
//            if (flag && prev!=-1)
//            	result++;
            
            System.out.println(result);
        }
    }
}