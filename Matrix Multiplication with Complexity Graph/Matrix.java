/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class Matrix {

    int m, n, o, p;
    int x, y, k, l;

    int matrixA[][];
    int matrixB[][];

    public void matA() {
        try {
                String s;
                
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter The Number Of Rows For Matrix A:");
                s = sc.next();
                m = Integer.parseInt(s);
                System.out.println("Enter The Number Of Columns For Matrix A:");
                s = sc.next();
                n = Integer.parseInt(s);
                System.out.println("\nEnter The Minimum Value Of Range:");
                s = sc.next();
                x = Integer.parseInt(s);
                System.out.println("Enter The Maximum Value Of Range:");
                s = sc.next();
                y = Integer.parseInt(s);
                this.matrixA = new int[m][n];

                Random random = new Random();
                if (x < y) {
                    System.out.println("\n");
                    
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            matrixA[i][j] = random.nextInt(y-x) + x;
                            System.out.println("MatrixA[" + i + "][" + j + "]=" + matrixA[i][j]);
                        }
                    }
                } else if(x==y)
                {
                    System.out.println("\n");
                    
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            matrixA[i][j] = x;
                            System.out.println("MatrixA[" + i + "][" + j + "]=" + matrixA[i][j]);
                        }
                    }
                }else{
                    System.out.println("\nMinimum Value Is Greater Than Maximum Value.\n");
                    matA();
                }
        } catch (NegativeArraySizeException e) {
            System.out.println("\nPlease Enter Positive Dimension Of Metrix\n");
            matA();
        } catch (NumberFormatException e) {
            System.out.println("\nPlease Enter Number For The Dimension Of Metrix\n");
            matA();
        }
    }

    public void matB() {
        try {
            String s;
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter The Number Of Rows For Matrix B:");
            s = sc.next();
            o = Integer.parseInt(s);
            System.out.println("Enter The Number Of Columns For Matrix B:");
            s = sc.next();
            p = Integer.parseInt(s);
            System.out.println("\nEnter The Minimum Value Of Range:");
            s = sc.next();
            k = Integer.parseInt(s);
            System.out.println("Enter The Maximum Value Of Range:");
            s = sc.next();
            l = Integer.parseInt(s);
            this.matrixB = new int[o][p];

            Random random = new Random();
            if (k < l) {
                System.out.println("\n");
                for (int i = 0; i < o; i++) {
                    for (int j = 0; j < p; j++) {
                        matrixB[i][j] = random.nextInt(l - k) + k;
                        System.out.println("MatrixB[" + i + "][" + j + "]=" + matrixB[i][j]);
                    }
                }
            } else if(k==l)
                {
                    System.out.println("\n");
                    
                    for (int i = 0; i < o; i++) {
                        for (int j = 0; j < p; j++) {
                            matrixB[i][j] = k;
                            System.out.println("MatrixB[" + i + "][" + j + "]=" + matrixB[i][j]);
                        }
                    }
                }
            else
            {
                System.out.println("\nMinimum Value Is Greater Than Maximum Value.");
                matB();
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("\nPlease Enter Positive Dimension Of Metrix");
            matB();
        } catch (NumberFormatException e) {
            System.out.println("\nPlease Enter Number For The Dimension Of Metrix\n");
            matA();
        }
    }

    public void addition() {
       
        int matrixC[][] = new int[m][n];
        int count;

        if (m == o && n == p) {
            System.out.println("\nSum Of Both The Metrices\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
                    System.out.println("MatrixC[" + i + "][" + j + "]=" + matrixC[i][j]);
                }
            }
            count=m*n;
            System.out.println("\nTotal Number Of Operations In Addition: " + count);
        }
        else {
            System.out.println("\nThe Dimension Of Both The Matrices Are Different For Addition.\n");
        }
        
        
    }

    public void subtraction() {
        
        int matrixD[][] = new int[m][n];
        int count;
        
        if (m == o && n == p) {
            System.out.println("\nSubtraction Of Both The Metrices\n");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrixD[i][j] = matrixA[i][j] - matrixB[i][j];
                    System.out.println("MatrixD[" + i + "][" + j + "]=" + matrixD[i][j]);
                }
            }
            count=m*n;
            System.out.println("\nTotal Number Of Operations In Subtraction: " + count);
        }
        else {
            System.out.println("\nThe Dimension Of Both The Matrices Are Different For Subtraction.\n");
        }
        
        
    }

    public void multiplication(){
        
        int sum = 0;
        int matrixE[][] = new int[m][p];
        int count;

        if (n == o) {
            System.out.println("\nMultiplication Of Both The Metrices\n");
            for (int i = 0; i < m; i++) {                
                    for (int j = 0; j < p; j++) {
                    for (int k = 0; k < o; k++) {
                        sum += matrixA[i][k] * matrixB[k][j];
                    }
                    matrixE[i][j] = sum;
                    System.out.println("MatrixE[" + i + "][" + j + "]=" + matrixE[i][j]);
                }
            }
           count=(o+(o-1))*m*p;
           System.out.println("\nTotal Number Of Operations In Multiplication: " + count + "\n");  
        }
        else {
            System.out.println("\nMultiplication Can't Be Performed Due To Dimension\n");
        }  
    }
}
