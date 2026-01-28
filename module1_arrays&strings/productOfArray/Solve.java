package twentyTwo_jan.module1.productOfArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        // Product of array

        Scanner scanner = new Scanner(System.in);

        // Enter array size;
        System.out.println("Enter array size");
        int n = scanner.nextInt();

        System.out.println("Enter array values");
        
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr.add(scanner.nextInt());
        }

        List<Integer> preffixProduct = new ArrayList<>(Collections.nCopies(n, 1));
        List<Integer> suffixProduct = new ArrayList<>(Collections.nCopies(n, 1));


        int prevProduct = 1;
        for(int i=0; i<n; i++){
            preffixProduct.set(i, prevProduct);
            prevProduct *=arr.get(i);
            // System.out.println(preffixProduct.get(i));
        }
        // System.out.println();

        int backProduct = 1;
        for(int i=n-1; i>=0; i--){
            suffixProduct.set(i, backProduct);
            backProduct *=arr.get(i);
            // System.out.println(suffixProduct.get(i));
        }
        // System.out.println();

        List<Integer> ans = new ArrayList<>(n);

        for(int i=0; i<n; i++){
            int temp = preffixProduct.get(i) * suffixProduct.get(i);

            ans.add(temp);
            // System.out.println(temp);
        }

        for(Integer it: ans){
            System.out.print(it + " ");
        }
        System.out.println("\nProgram ended");
        scanner.close();
    }
}
