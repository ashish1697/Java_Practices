package Practice;

import java.util.Stack;

public class bodmas {
    public static void main(String[] args) {
        String[] arr ={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        Stack<String> stack = new Stack<>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != "+" && arr[i] != "-"
                    && arr[i] != "*" && arr[i] != "/") {
                stack.push(arr[i]);
                continue;
            }else{
                choice = arr[i];
            }
            switch (choice) {
                case "+":

                    // Performing the "+" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "-":

                    // Performing the "-" operation by poping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;

                case "*":

                    // Performing the "*" operation
                    // by poping put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "/":

                    // Performing the "/" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;

                default:
                    continue;
            }
        }
        System.out.println(Integer.parseInt(stack.pop()));

    }
}
