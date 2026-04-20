package com.mycompany.matriz3x3;

import java.util.Scanner;

public class MainMatriz3x3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Matriz3x3 A = new Matriz3x3();
        Matriz3x3 B = new Matriz3x3();

        System.out.println("Ingrese datos de la matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A.setValor(i, j, sc.nextInt());
            }
        }

        System.out.println("\nIngrese datos de la matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B.setValor(i, j, sc.nextInt());
            }
        }

        System.out.println("\nMatriz A:");
        A.imprimir();

        System.out.println("\nMatriz B:");
        B.imprimir();

        Matriz3x3 suma = A.sumar(B);
        System.out.println("\nSuma A + B:");
        suma.imprimir();

        Matriz3x3 mult = A.multiplicar(B);
        System.out.println("\nMultiplicación A * B:");
        mult.imprimir();
    }
}
