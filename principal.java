/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sistemarestaruante2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class principal {
    public static List plato = new ArrayList<Plato>();
    public static List cliente = new ArrayList<Cliente>();
    public static List venta = new ArrayList<Venta>();
  
  
    public static void main(String[] args) {
        menu();
       
    }
    public static void menu(){
        Scanner leer = new Scanner(System.in);
          int PrecioDeCompra, CostoDelPlato, cantidadVendida, Preciopagado;
    String descripcion, tipoDeAlmuerozo, NumeroDeDocumento;
     int op = 0;
    String nombrePlato, TipoDeDocumento, fecha;
    int PrecioDeVenta;
    String NombreCompleto, NombreDeEmpresa, tipoDeDocumento;
    boolean menu = true;
    do {
        System.out.println("_______________________________________________\n");
            System.out.println("Escoge una de las opciones \n"
                    + "1: registrar plato\n"
                    + "2: registrar una venta\n"
                    + "3: registrar cliente\n"
                    + "4: Salir del sistema"
            );

            op = leer.nextInt();
            switch (op) {

                case 1: {
                    System.out.println("Ingrese un nombre del plato");
                    nombrePlato = leer.next();
                    System.out.println("Ingrese el costo del plato");
                    CostoDelPlato = leer.nextInt();
                    System.out.println("Ingrese el precio de venta?");
                    PrecioDeVenta = leer.nextInt();
                    System.out.println("Ingrese el tipo");
                    tipoDeAlmuerozo = leer.next();
                    System.out.println("Ingrese una dscripcion breve");
                    descripcion = leer.next();
                    plato.add(new Plato(nombrePlato, CostoDelPlato, PrecioDeVenta, tipoDeAlmuerozo, descripcion));
                    break;
                }
                case 2: {
                    System.out.println("Ingrese el nombre del plato");
                    nombrePlato = leer.next();
                    System.out.println("Ingrese la cantidad vendida");
                    cantidadVendida = leer.nextInt();
                    System.out.println("Ingrese el precio pagado");
                    Preciopagado = leer.nextInt();
                    System.out.println("Ingrese el numero de documeto");
                    NumeroDeDocumento = leer.next();
                    System.out.println("Ingrese el tipo de documento");
                    TipoDeDocumento = leer.next();
                    System.out.println("Ingrese la fecha de hoy");
                    fecha = leer.next();
                    // venta.add(new Venta());
                    venta.add(new Venta(nombrePlato, cantidadVendida, Preciopagado, NumeroDeDocumento, TipoDeDocumento, fecha));
                    break;
                }
                case 3: {
                    System.out.println("Ingrese el numero de documento");
                    NumeroDeDocumento = leer.next();
                    System.out.println("Ingrese el tipo de documento");
                    TipoDeDocumento = leer.next();
                    System.out.println("Ingrese el nombre completo");
                    NombreCompleto = leer.next();
                    System.out.println("Ingrese el nombre de la empresa");
                    NombreDeEmpresa = leer.next();
                    //cliente.add(new Cliente());
                    cliente.add(new Cliente(NumeroDeDocumento, TipoDeDocumento, NombreCompleto, NombreDeEmpresa));

                    break;
                }
                case 4: {
                    menu = false;
                    break;
                }
                default: {
                    System.out.println("Tiene que se una de las 4 opciones");
                }
            }
        } while (menu == true);
     
    }
    
    
}
