import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, how is your day going?/n Can you tell us your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", happy to meet you.");
        scanner.close();
    }
}
