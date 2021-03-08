package com.mycompany.sistemarestaruante;


public class Plato {

   
    private String NombreDelPlato;
    private int Costo;//mano de obra mas ingredientes
    private int precioDeVenta;
   // private int promedio;
    private int tipo;//desayuna,almuerzo,cena

    public  Plato(String NombreDelPlato, int Costo, int precioDeVenta, int tipo) {
        this.NombreDelPlato = NombreDelPlato;
        this.Costo = Costo;
        this.precioDeVenta = precioDeVenta;
      
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
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
        
    
    }


