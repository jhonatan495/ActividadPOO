package com.mycompany.sistemarestaruante2;

public class Plato {

    private String NombreDelPlato;
    private int Costo;
    private int precioDeVenta;
    private String descripcion;
    private String tipo;

    public Plato(String NombreDelPlato, int Costo, int precioDeVenta, String descripcion, String tipo) {
        this.NombreDelPlato = NombreDelPlato;
        this.Costo = Costo;
        this.precioDeVenta = precioDeVenta;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getNombreDelPlato() {
        return NombreDelPlato;
    }

    public void setNombreDelPlato(String NombreDelPlato) {
        this.NombreDelPlato = NombreDelPlato;
    }

    public int getCosto() {
        return Costo;
    }

    public void setCosto(int Costo) {
        this.Costo = Costo;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
