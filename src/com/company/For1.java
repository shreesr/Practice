package com.company;

/*
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
  1 2 3 4 3 2 1
    1 2 3 2 1
      1 2 1
        1
 */

public class For1 {
    public static void main(String[] args) {


//        int row=5;

        for (int i=1;i<=5;i++){
            for(int j=5-i;j>=1;j--) {
                System.out.print(" ");
                 }
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                for (int j=i-1;j>=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }

        for (int i=4;i>=1;i--){
            for(int j=5-i;j>=1;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }


        }
    }

