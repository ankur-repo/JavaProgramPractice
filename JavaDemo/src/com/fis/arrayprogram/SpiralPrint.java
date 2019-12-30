package com.fis.arrayprogram;

import java.io.*; 

class SpiralPrint { 
    // Function print matrix in spiral form 
    static void spiralPrint(int r, int c, int a[][]) 
    { 
        int i, k = 0, l = 0; 
        /*  
           k - starting row index 
           r - ending row index 
           l - starting column index 
           c - ending column index 
           i - iterator 
        */
  
        while (k < r && l < c) { 
            // Print the first row from the remaining rows 
            for (i = l; i < c; i++) { 
                System.out.print(a[k][i] + " "); 
            } 
            k++; 
  
            // Print the last column from the remaining columns 
            for (i = k; i < r; i++) { 
                System.out.print(a[i][c - 1] + " "); 
            } 
            c--; 
  
            // Print the last row from the remaining rows */ 
            if (k < r) { 
                for (i = c - 1; i >= l; i--) { 
                    System.out.print(a[r - 1][i] + " "); 
                } 
                r--; 
            } 
  
            // Print the first column from the remaining columns */ 
            if (l < c) { 
                for (i = r - 1; i >= k; i--) { 
                    System.out.print(a[i][l] + " "); 
                } 
                l++; 
            } 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int R = 3; 
        int C = 6; 
        int a[][] = { { 1, 2, 3, 4, 5, 6 }, 
                      { 7, 8, 9, 10, 11, 12 }, 
                      { 13, 14, 15, 16, 17, 18 } }; 
        spiralPrint(R, C, a); 
    } 
} 
