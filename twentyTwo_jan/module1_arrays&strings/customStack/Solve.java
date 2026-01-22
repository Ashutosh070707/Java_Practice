package twentyTwo_jan.module1.customStack;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        // Creating custom stack
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the capacity of the stack");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        Stack st = new Stack(capacity);

        String operation = "";

        do {
            System.out.println("Enter command (push/pop/peek).");
            operation = scanner.nextLine();
            switch (operation) {
                case "push" -> {
                    if (st.getPointer() + 1 >= st.getCapacity()) {
                        System.out.println("Stack is full");
                    } else {
                        System.out.println("Enter the value you want to push");
                        int val = scanner.nextInt();
                        st.increasePointer();
                        st.addElement(val);
                    }
                }
                case "pop" -> {
                    if (st.getPointer() < 0) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Element popped successfully");
                        st.decreasePointer();
                    }
                }
                case "peek" -> {
                    if (st.getPointer() < 0) {
                        System.out.println("Stack is empty");
                    } else {
                        System.out.println("Top element is : " + st.getPeek());
                    }
                }
            }

        } while (!operation.equals("exit"));

        System.out.println("\nProgram ended");
        scanner.close();
    }

}
