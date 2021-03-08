package com.mycompany.sistemarestaruante;




public class Venta {

private String NombreDelPlato;
private int cantidadVendida;
private int Total;    
private int ID;    
private int NIT;    

    public  Venta(String NombreDelPlato, int cantidadVendida,int total,int nit,int id) {
        
        this.NombreDelPlato = NombreDelPlato;
        this.cantidadVendida = cantidadVendida;
        this.Total=total;
        
    }

    public String getNombreDelPlato() {
        return NombreDelPlato;
    }
    public void setNombreDelPlato(String NombreDelPlato) {
        this.NombreDelPlato = NombreDelPlato;
    }
    public int getCantidadVendida() {
        return cantidadVendida;
    }
    public void setCantidadVendida(int cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }
    public int gettotal() {
        return Total;
    }
    public void settotalo(int PrecioPorPLato) {
        this.Total = PrecioPorPLato;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getNIT() {
        return NIT;
    }
    public void setNIT(int NIR) {
        this.NIT = NIT;
    }


   


}
