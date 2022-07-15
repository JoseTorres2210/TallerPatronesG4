/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrafo2facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author josel
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.print("========= Tienda ============ \n");
        System.out.print("========= Servicios: ============ \n"); 
            System.out.print("            1. MOVIL              \n");  
            System.out.print("            2. WEB              \n");  
            System.out.print("            3. TELEFONICO           \n");  
            System.out.print("Elegir servicio: "); 
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
            String eleccion=br.readLine();
            Tienda.tipoServicio(eleccion);
    }
    
}
