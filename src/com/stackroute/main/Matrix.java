package com.stackroute.main;

import java.util.Scanner;

public class Matrix {
    private int [][] matrix1;
    private int [][] matrix2;
    private int noOfRows;
    private int noOfCols;

    public void additionOfMatrices(){
        System.out.println("Input number of rows of matrix : ");
        Scanner scanner = new Scanner(System.in);
        noOfRows = scanner.nextInt();
        System.out.println("Input number of columns of matrix : ");
        noOfCols = scanner.nextInt();

        matrix1 = new int[noOfRows][noOfCols];
        matrix2 = new int[noOfRows][noOfCols];

        System.out.println("Input elements of first matrix : ");
        for (int i=0; i<noOfRows; i++)
            for (int j=0; j<noOfCols; j++)
                matrix1[i][j] = scanner.nextInt();
        System.out.println("Input elements of second matrix : ");
        for (int i=0; i<noOfRows; i++)
            for (int j=0; j<noOfCols; j++)
                matrix2[i][j] = scanner.nextInt();

        int [][] result=new int[noOfRows][noOfCols];
        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfCols;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfCols;j++){
                System.out.println(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}

