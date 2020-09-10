import java.util.Scanner;
import java.util.Stack;

public class Stack_Collection_Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String str = scan.nextLine();
        System.out.println("The sentence is : " + str);
        Stack<String> stack = new Stack<>();
        String[] words;
        String[] sent = str.split("[.]");
        System.out.println(sent.length);
        for (int j = sent.length - 1; j >= 0; j--) {
            words = sent[j].split(" ");
            stack.push(".");
            for (int i = 0; i < words.length; i++) {
                stack.push(words[i]);
            }

        }
        String temp;
        while (!stack.isEmpty()) {
            temp = stack.pop();
            if (temp == ".")
                System.out.print(temp);
            else
                System.out.print(" " + temp);
        }
    }
}