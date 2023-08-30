

package com.mycompany.progranm3;

/**
 *
 * @author luis camilo
 */
 import java.util.Scanner;
public class punto1 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de elementos: ");
        int numElementos = scanner.nextInt();
        
        int[] datos = new int[numElementos];
        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese un dato: ");
            datos[i] = scanner.nextInt();
        }
        
        ordenamientoSeleccion(datos);
        
        System.out.println("Lista ordenada:");
        for (int dato : datos) {
            System.out.print(dato + " ");
        }
    }
    
    public static void ordenamientoSeleccion(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indiceMinimo];
            arr[indiceMinimo] = temp;
        }
    }
}
