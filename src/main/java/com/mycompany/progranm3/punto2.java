/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progranm3;

/**
 *
 * @author luis camilo
 */
import java.util.Arrays;
import java.util.Scanner;

    
public class punto2 {

    public static double calcularMediana(double[] vector) {
        Arrays.sort(vector);
        int n = vector.length;
        int indiceMediana = n / 2;
        return vector[indiceMediana];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de elementos (n): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("La cantidad de elementos debe ser impar.");
            return;
        }

        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextDouble();
        }

        double mediana = calcularMediana(vector);
        System.out.println("La mediana es: " + mediana);

        scanner.close();
    }
}

    

