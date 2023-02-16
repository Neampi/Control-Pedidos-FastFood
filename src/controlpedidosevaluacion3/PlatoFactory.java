/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class PlatoFactory {
    public Plato generarPedido(int numplato){
        switch(numplato){
            case 1:
                return new HamburguesaPeruana();
            case 2:
                return new BigBox();
            case 3:
                return new BanquetePersonal();
            case 4:
                return new EnchiladaVenezolana();
            case 5:
                return new Especial4Estaciones();
            default:
                return null;
        }
    }
}
