package com.mycompany.sistemarestaruante;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Restaruante {

    ArrayList<Plato> ListPlato = new ArrayList<Plato>();
    ArrayList<Venta> Listventa = new ArrayList<Venta>();
    ArrayList<Cliente> Listcliente = new ArrayList<Cliente>();
    int PrecioDeCompra, CostoDelPlato, cantidadVendida, total,id,nit;

    public void Restaruante(ArrayList plato, ArrayList venta, ArrayList cliente) {
        //this.plato = plato;
        //this.venta = venta;
        //this.cliente = cliente;

        menu();
        Reporte();

    }

    public ArrayList getPlato() {
        return ListPlato;
    }

    public void setPlato(ArrayList plato) {
        this.ListPlato = plato;
    }

    public ArrayList getVenta() {
        return Listventa;
    }

    public void setVenta(ArrayList venta) {
        this.Listventa = venta;
    }

    public ArrayList getCliente() {
        return Listcliente;
    }

    public void setCliente(ArrayList cliente) {
        this.Listcliente = cliente;
    }

    public void menu() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        String nombrePlato, ID, NIT;
        int PrecioDeVenta, tipo;
        String NombreCompleto, NombreDeEmpresa, tipoDeDocumento;
       
        boolean menu = true;
        do {

            System.out.println("Escoge una de las opciones /n"
                    + "1: registrar plato/n"
                    + "2: registrar una venta/n"
                    + "3: registrar cliente/n"
                    + "4: Salir del sistema"
            );

            switch (op) {

                case 1: {
                    System.out.println("Ingrese un nombre del plato");
                    nombrePlato = "";//leer.next();
                    System.out.println("Ingrese el costo del plato");
                    CostoDelPlato = leer.nextInt();
                    System.out.println("Ingrese el precio de venta?");
                    PrecioDeVenta = leer.nextInt();
                    System.out.println("Ingrese el tipo");
                    tipo = leer.nextInt();
                    ListPlato.add(new Plato(nombrePlato, CostoDelPlato, PrecioDeVenta, tipo));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del plato");
                    nombrePlato = leer.next();
                    System.out.println("Ingrese la cantidad vendida");
                    cantidadVendida = leer.nextInt();
                    System.out.println("Ingrese el total");
                    total = leer.nextInt();
                    System.out.println("Ingrese el id");
                    id=leer.nextInt();
                    System.out.println("Ingrese el nit");
                    nit=leer.nextInt();
                    // venta.add(new Venta());
                    Listventa.add(new Venta(nombrePlato, cantidadVendida, total,id,nit));
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el ID");
                    ID = leer.next();
                    System.out.println("Ingrese el NIT");
                    NIT = leer.next();
                    System.out.println("Ingrese el nombre completo");
                    NombreCompleto = leer.next();
                    System.out.println("Ingrese el tipo del documento");
                    tipoDeDocumento = leer.next();
                    System.out.println("Ingrese el nombre de la empresa");
                    NombreDeEmpresa = leer.next();
                    //cliente.add(new Cliente());
                    Listcliente.add(new Cliente(ID, NIT, NombreCompleto, tipoDeDocumento, NombreDeEmpresa));

                    break;
                }
                case 4: {
                    menu = false;
                }
                default: {
                    System.out.println("Tiene que se una de las 3 opciones");
                }
            }
        } while (menu == true);
    }

    public void Reporte() {
int resultado=0;
        for (Plato elemento : ListPlato) {
            System.out.println("El nombre del plato es: " + elemento.getNombreDelPlato()
                    + "El precio de venta es: " + elemento.getPrecioDeVenta()
                    + "El tipo es: " + elemento.getTipo());
        }

        for (Cliente EleCliente : Listcliente) {

            System.out.println("EL nombre completo : " + EleCliente.getNombreCompleto());
        }
        for(Venta ElemVenta: Listventa){
          resultado+=ElemVenta.gettotal() ;
           
        }
         System.out.println("El suma de ventas totales es: "+resultado);
    }

}
