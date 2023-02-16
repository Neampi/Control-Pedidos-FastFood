/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlpedidosevaluacion3;

/**
 *
 * @author USUARIO
 */
public abstract class Plato {
    
    private String nombrePlato;
    private float precioPlato;
    private String detallePlato;

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public float getPrecioPlato() {
        return precioPlato;
    }

    public void setPrecioPlato(float precioPlato) {
        this.precioPlato = precioPlato;
    }

    public String getDetallePlato() {
        return detallePlato;
    }

    public void setDetallePlato(String detallePlato) {
        this.detallePlato = detallePlato;
    }
    
    
    
}
