/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progranm3;

/**
 *
 * @author luis camilo
 */
import java.util.Scanner;
public class Punto3 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de estudiantes: ");
        int numEstudiantes = scanner.nextInt();
        System.out.print("Ingresa la cantidad de asignaturas: ");
        int numAsignaturas = scanner.nextInt();

        double[][] notas = new double[numEstudiantes][numAsignaturas];
        double[] mediasIndividuales = new double[numEstudiantes];
        double[] mediasAsignaturas = new double[numAsignaturas];
        double mediaTotal = 0;

        // Ingresar las notas de los estudiantes
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < numAsignaturas; j++) {
                System.out.print("Ingresa la nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                mediasIndividuales[i] += notas[i][j];
                mediasAsignaturas[j] += notas[i][j];
            }
            mediasIndividuales[i] /= numAsignaturas;
            mediaTotal += mediasIndividuales[i];
            System.out.println(); // Salto de línea entre estudiantes
        }

        // Calcular medias de asignaturas y media total
        for (int j = 0; j < numAsignaturas; j++) {
            mediasAsignaturas[j] /= numEstudiantes;
        }
        mediaTotal /= numEstudiantes;

        // Ordenar estudiantes por notas medias individuales (Método Shell)
        for (int gap = numEstudiantes / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < numEstudiantes; i++) {
                double tempMedia = mediasIndividuales[i];
                int j;
                for (j = i; j >= gap && mediasIndividuales[j - gap] < tempMedia; j -= gap) {
                    mediasIndividuales[j] = mediasIndividuales[j - gap];
                }
                mediasIndividuales[j] = tempMedia;
            }
        }

        // Mostrar resultados
        System.out.println("\nMedia de cada estudiante (orden decreciente):");
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ": " + mediasIndividuales[i]);
        }

        System.out.println("\nMedia de cada asignatura:");
        for (int j = 0; j < numAsignaturas; j++) {
            System.out.println("Asignatura " + (j + 1) + ": " + mediasAsignaturas[j]);
        }

        System.out.println("\nMedia total de la clase: " + mediaTotal);

        scanner.close();
    }
}

    

