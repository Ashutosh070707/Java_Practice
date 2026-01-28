package twentyTwo_jan.module1.rotateArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter size of the array");
        int n = scanner.nextInt();

        List<Integer> ls = new ArrayList<>(n);
        System.out.println("Enter values");
        for(int i=0; i<n; i++){
            ls.add(scanner.nextInt());
        }

        System.out.println("Enter the value (k) by which you want to right rotate the array (should not be negative)");
        int k = scanner.nextInt();
        k = k%n;

        Collections.reverse(ls.subList(n-k, n));
        Collections.reverse(ls.subList(0, n-k));
        Collections.reverse(ls.subList(0, n));

        for(Integer it: ls){
            System.out.print(it + " ");
        }
        System.out.println("\nProgram Ended");
        scanner.close();
    }
}
