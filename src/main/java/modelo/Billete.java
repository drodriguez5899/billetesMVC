/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David
 */
public class Billete {
    private String fechaVuelo;
    private int cant;
    private double precio;
    private int mes;

    public Billete() {
    }

    public Billete(String fechaVuelo, int cant) {
        this.fechaVuelo = fechaVuelo;
        this.cant = cant;
    }
    
    public double getImporte(){
        double precio;
        mes = Integer.parseInt(this.fechaVuelo.substring(5,7));
        if(mes >=5 && mes <=9 ) {//temporada alta
            precio=150.0;            
        }else {
            precio=900.0;
        }
        double precioSinIva=precio*cant;
        return Math.round(precioSinIva*1.21);
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
}
