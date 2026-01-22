package twentyTwo_jan.module1.spiralMatrix;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        // Printing Spiral Matrix

        Scanner scanner = new Scanner(System.in);

        int n, m;
        System.out.println("Enter dimensions of the 2D array");
        n = scanner.nextInt();
        m = scanner.nextInt();

        int[][] arr = new int[n][m];

        System.out.println("Enter entries for the array");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        

        //Printing Spiral

        int[][] vis = new int[n][m];
        String direction = "right";
        int i=0, j=0;

        int[] drow = {0,1,0,-1};
        int[] dcol = {1,0,-1,0};

        while(true){
            vis[i][j] = 1;
            System.out.print(arr[i][j] + " ");
            
            //base condition
            boolean flag = true;

            for(int k=0; k<4; k++){
                int nr = i+drow[k];
                int nc = j+dcol[k];
                if(nr>=0 && nr<n && nc>=0 && nc<m){
                    if(vis[nr][nc]==0){
                        flag = false;
                        break;
                    }
                }
            }

            if(flag) break;

            
            if(direction=="right"){
                if(j+1>=m || vis[i][j+1]==1){
                    direction = "down";
                    ++i;
                }
                else {
                    ++j;
                }
            }
            else if(direction=="down"){
                if(i+1>=n || vis[i+1][j]==1){
                    direction = "left";
                    --j;
                }
                else{
                    ++i;
                }
            }
            else if(direction=="left"){
                if(j-1<0 || vis[i][j-1]==1){
                    direction = "up";
                    --i;
                }
                else{
                    --j;
                }
            }
            else {
                if(i-1<0 || vis[i-1][j]==1){
                    direction = "right";
                    ++j;
                }
                else{
                    --i;
                }
            }
        }

        System.out.println("\nProgram closed");
        scanner.close();
    }

}
