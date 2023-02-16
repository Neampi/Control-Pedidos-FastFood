/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class EnchiladaVenezolana extends Plato{
    
    public EnchiladaVenezolana(){
        this.setNombrePlato("Enchilada Venezolana");
        this.setPrecioPlato((float) 7.70);
        this.setDetallePlato(this.getNombrePlato()+"  S/."+this.getPrecioPlato());
    }
    
}
