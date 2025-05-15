package com.pack;
import java.util.*;

public class ExpressionEvaluator {

    public static void main(String[] args) {
        String expression = "(2 + (2 - 1 + 3) + 4)";
        int result = evaluate(expression);
        System.out.println("Result: " + result); // Output: 10
    }

    public static int evaluate(String expr) {
        return evaluateExpr(new LinkedList<>(expr.replaceAll(" ", "").chars()
                .mapToObj(c -> String.valueOf((char) c))
                .toList()));
    }

    private static int evaluateExpr(Queue<String> tokens) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        while (!tokens.isEmpty()) {
            String ch = tokens.poll();

            if (ch.equals("(")) {
                num = evaluateExpr(tokens);
            } else if (Character.isDigit(ch.charAt(0))) {
                num = num * 10 + Integer.parseInt(ch);
            }

            if (!Character.isDigit(ch.charAt(0)) && !ch.equals(" ") || tokens.isEmpty()) {
                if (ch.equals(")")) break;

                switch (sign) {
                    case '+': stack.push(num); break;
                    case '-': stack.push(-num); break;
                }
                sign = ch.charAt(0);
                num = 0;
            }
        }

        return stack.stream().mapToInt(i -> i).sum();
    }
}
