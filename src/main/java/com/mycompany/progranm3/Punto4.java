/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progranm3;

/**
 *
 * @author luis camilo
 */
        import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

    
        

public class Punto4 {

    public static void main(String[] args) {
        Map<String, String> telefonosPorNombre = new HashMap<>();
        Map<String, String> nombresPorTelefono = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader("lista_datos.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String nombre = parts[0].trim();
                    String telefono = parts[1].trim();
                    telefonosPorNombre.put(nombre, telefono);
                    nombresPorTelefono.put(telefono, nombre);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Consultar por nombre");
            System.out.println("2. Consultar por número de teléfono");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consume la nueva línea pendiente
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre a consultar: ");
                    String nombreConsulta = scanner.nextLine();
                    if (telefonosPorNombre.containsKey(nombreConsulta)) {
                        System.out.println("Teléfono: " + telefonosPorNombre.get(nombreConsulta));
                    } else {
                        System.out.println("Nombre no encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número de teléfono a consultar: ");
                    String telefonoConsulta = scanner.nextLine();
                    if (nombresPorTelefono.containsKey(telefonoConsulta)) {
                        System.out.println("Nombre: " + nombresPorTelefono.get(telefonoConsulta));
                    } else {
                        System.out.println("Número de teléfono no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}

   

