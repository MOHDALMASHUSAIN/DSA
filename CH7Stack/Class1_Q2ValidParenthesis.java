package CH7Stack;

class Stack {
    private static char arr[];
    private static int maxsize;
    private static int top;

    public Stack(int capacity) {
        this.maxsize = capacity;
        this.top = -1;
        this.arr = new char[capacity];
    }

    public static void push(char value) {
        if (top < maxsize - 1) {
            arr[++top] = value;
            System.out.println("Added bracket is ::" + value);
        } else {
            System.out.println("Case of overflow");
        }
    }

    public static boolean isValidParenthesis() {
        if (top % 2 != 0) {
            return false; // If the number of elements is odd, it can't be valid
        }

        for (int i = 0, j = top; i <= top / 2; i++, j--) {
            if ((arr[i] == '(' && arr[j] == ')') ||
                (arr[i] == '[' && arr[j] == ']') ||
                (arr[i] == '{' && arr[j] == '}')) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}

public class Class1_Q2ValidParenthesis {
    public static void main(String[] args) {
        Stack s = new Stack(6);
        s.push('{');
        s.push('[');
        s.push('(');
        s.push(')');
        s.push(']');
        s.push('}');

        if (s.isValidParenthesis()) {
            System.out.println("Valid parenthesis");
        } else {
            System.out.println("Not a valid parenthesis");
        }
    }
}
