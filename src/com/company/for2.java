package com.company;

/*

1
2 3 4
3 4 5 6
4 5 6 7 8 9
5 6 7 8 9 10 11
 */

public class for2 {
    public static void main(String[] args) {

        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(i+j-1 + " ");


            }
            System.out.println();
        }
    }
}
