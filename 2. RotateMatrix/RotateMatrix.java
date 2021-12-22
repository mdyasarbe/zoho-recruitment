package RotateMatrix;

import java.util.Scanner;

public class RotateMatrix {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Size of N");
        int n = sc.nextInt();
        int arr[][]= new int[n][n];
        System.out.println("Enter Matrix Elements Row wise");
        int i,j,k;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(i=n-1;i>=0;i--){
            for(j=0;j<n;j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }

    }
    
}
/*
 1 2 3
 4 5 6
 7 8 9
 

 3 6 9
 2 5 8
 1 4 7


*/
