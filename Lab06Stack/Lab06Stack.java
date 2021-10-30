package Lab06Stack;

import java.util.Stack;

public class Lab06Stack {
        public static void main(String[] args) {
                // the three integer stacks
                Stack<Integer> s1 = new Stack<Integer>();
                Stack<Integer> s2 = new Stack<Integer>();
                Stack<Integer> s3 = new Stack<Integer>();

                int values[] = { -1, 15, 23, 44, 4, 99 };
                // to add above values to stacks 1 and 2
                for (int value : values) {
                        s1.push(value);
                        s2.push(value);
                }

                // looping and moving each element from first stack into third stack
                while (!s1.isEmpty()) {
                        s3.push(s1.pop());
                }

                // looping until s2 is empty
                while (!s2.isEmpty()) {
                        // removing top elements from s2 and s3, displaying as a pair.
                        System.out.println(s2.pop() + ", " + s3.pop());
                }
        }
}

