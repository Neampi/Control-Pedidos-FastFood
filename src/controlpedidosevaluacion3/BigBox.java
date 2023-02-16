/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public class BigBox extends Plato{
    
    public BigBox(){
        this.setNombrePlato("Big Box");
        this.setPrecioPlato((float) 8.50);
        this.setDetallePlato(this.getNombrePlato()+"  S/."+this.getPrecioPlato());
    }
    
}
