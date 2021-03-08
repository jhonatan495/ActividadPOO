
package com.mycompany.sistemarestaruante;



public class Cliente {
  
   private String ID;
   private String NIT;
   private String TipoDeDocumento;
   private String NombreCompleto;
   private String NombreDeEmpresa;

    public  Cliente(String ID, String NIT, String TipoDeDocumento, String NombreCompleto, String NombreDeEmpresa) {
        this.ID = ID;
        this.NIT = NIT;
        this.TipoDeDocumento = TipoDeDocumento;
        this.NombreCompleto = NombreCompleto;
        this.NombreDeEmpresa = NombreDeEmpresa;
       
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getTipoDeDocumento() {
        return TipoDeDocumento;
    }

    public void setTipoDeDocumento(String TipoDeDocumento) {
        this.TipoDeDocumento = TipoDeDocumento;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getNombreDeEmpresa() {
        return NombreDeEmpresa;
    }

    public void setNombreDeEmpresa(String NombreDeEmpresa) {
        this.NombreDeEmpresa = NombreDeEmpresa;
    }
    
   
}
