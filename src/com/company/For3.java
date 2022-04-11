package com.company;

/*
6 8 7 9 5 4 3 2 1
8 7 6 5 4 3 2 1
7 6 5 4 3 2 1
6 5 4 3 2 1
5 4 3 2 1
4 3 2 1
3 2 1
2 1
1
 */

public class For3 {

    public static void main(String[] args) {

        for (int i=10-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                if( j == 9) {
                    System.out.print("");
                }
                System.out.print(j + " ");


            }
            System.out.println();
        }
    }
}
