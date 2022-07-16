/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.sql.SQLException;
import paquete01.Enlace;
import paquete02.Ciudad;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Principal {
    
    public static void main(String[] args) throws SQLException {
        Enlace c = new Enlace();
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        
        while (bandera) {
            System.out.print("\nIngrese la ciudad que desea Ingresar: ");
            String ciu = sc.nextLine();
            System.out.print("Ingrese la población: ");
            int pob = sc.nextInt();
            sc.nextLine();

            Ciudad ciudad = new Ciudad(ciu, pob);
            c.insertarCiudad(ciudad);
           
            System.out.print("¡SI NO DESEA INGRESAR MAS DATOS PULSE X!: ");
            String salida = sc.nextLine().toUpperCase();
            
            if (salida.equals("X")) {
                bandera = false;
            }
        }
        
        
        /*for (int i = 0; i < c.obtenerDataCiudad().size(); i++) {
        System.out.printf("%s", c.obtenerDataCiudad().get(i));
        }*/
    }
}
