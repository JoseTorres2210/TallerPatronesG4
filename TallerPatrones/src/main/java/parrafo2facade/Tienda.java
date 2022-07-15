/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parrafo2facade;

/**
 *
 * @author josel
 */
public class Tienda {
    private Servicio movil;
    private Servicio web;
    private Servicio telefonico;
    
    public static void tipoServicio(String servicio){
        if(servicio=="movil"){
            realizarServicioMovil();
            
        }
        if(servicio=="web"){
            realizarServicioWeb();
            
        }
        if(servicio=="telefonico"){
            realizarServicioTelefonico();
            
        }
    }

    private static void realizarServicioMovil() {
        movil.crearCuenta();
        movil.agregarProducto();
        movil.comprar();
    }

    private static void realizarServicioWeb() {
        web.crearCuenta();
        web.agregarProducto();
        web.comprar();
    }

    private static void realizarServicioTelefonico() {
        telefonico.crearCuenta();
        telefonico.agregarProducto();
        telefonico.comprar();
    }
}
