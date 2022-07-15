/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parrafo3decorate;

/**
 *
 * @author josue
 */
public class NotificarDecorator implements Notificar{

    private Notificar wrappee;

    public NotificarDecorator(Notificar wrappee) {
        this.wrappee = wrappee;
    }
    
    @Override
    public void enviar(String mensaje) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
