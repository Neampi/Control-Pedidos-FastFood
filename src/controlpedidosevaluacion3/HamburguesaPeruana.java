/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class HamburguesaPeruana extends Plato{
    
    public HamburguesaPeruana(){
        this.setNombrePlato("Hamburguesa Peruana");
        this.setPrecioPlato((float) 14.50);
        this.setDetallePlato(this.getNombrePlato()+"  S/."+this.getPrecioPlato());
    }
    
}
