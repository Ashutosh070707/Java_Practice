package twentyTwo_jan.module1.stringCompression;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        // String compression
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Enter the string which you want to compress");
        str = scanner.nextLine();

        if(str.length()==0){
            System.out.println("Invalid string!");
            return;
        }

        StringBuilder ans = new StringBuilder();
        char prev = str.charAt(0);
        int count = 0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==prev){
                ++count;
            }
            else{
                ans.append(prev);
                ans.append(count);
                count = 1;
                prev = str.charAt(i);
            }
        }

        ans.append(prev);
        ans.append(count);

        System.out.println("Compressed string : " + ans);
    }

}
