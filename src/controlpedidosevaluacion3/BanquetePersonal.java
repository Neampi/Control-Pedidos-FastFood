/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class BanquetePersonal extends Plato{
    
    public BanquetePersonal(){
        this.setNombrePlato("Banquete Personal");
        this.setPrecioPlato((float) 11.70);
        this.setDetallePlato(this.getNombrePlato()+"  S/."+this.getPrecioPlato());
    }
    
}
