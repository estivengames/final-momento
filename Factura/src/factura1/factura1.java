/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura1;

/**
 *
 * @author Estudiantes.bog
 */

import java.util.*;
/**
 *
 * @author Familia
 */
public class factura1{
    public static void main(String[] args){
        int cant ,opc=0, edad ;
        double precio,total ,acumtotal = 0,imp ,desc ,Subt,pago ,dev ;
        String Nombre , Producto , a ;
        Scanner captu = new Scanner(System.in);
        System.out.print("\n\t\tBIENVENIDO AL SISTEMA DE FACTURACION");
       
        System.out.print("\n\nIngrese el nombre del cliente : ");
        Nombre = captu.nextLine();
       
        System.out.print("\n\nIngrese Edad del cliente : ");
            edad = captu.nextInt();
       
        while(opc!=2){
           
            a=captu.nextLine();
            System.out.print("\n\nIngrese Nombre del producto : ");
            Producto = captu.nextLine();
           
           
            System.out.print("\n\nIngrese Precio del producto : ");
            precio = captu.nextDouble();
           
            System.out.print("\n\nIngrese Cantidad del producto : ");
            cant = captu.nextInt();
           
            Subt = cant * precio;
           
            imp = Subt * 0.10;
            if (edad >= 60 && edad <=90){
                  desc = Subt * 0.10;
            }else{
            desc = 0;
            }
           
            total = (Subt + imp) - desc;
           
            acumtotal += total;
           
           System.out.print("\n\nSu Subtotal es de : " + Subt + "Pesos");
           System.out.print("\n\nSu Impuesto es de : " + imp + "Pesos");
           System.out.print("\n\nSu Descuento es de : " + desc + "Pesos");
           System.out.print("\n\nSu Total por el producto  : " + Producto + "Es de " + total + " Pesos.");
           
           System.out.print("\n\nDesea Ingresar otro producto : 1. SI       2. NO");
           opc=captu.nextInt();
        }
        System.out.print("\n\nEl total a pagar el cliente : " + Nombre + "Es de : " +acumtotal+ "Pesos");
        System.out.print("\n\nCantidad de dinero con el que cliente paga : ");
        pago = captu.nextDouble();
       
        dev = acumtotal - pago ;
       
        if (pago > acumtotal){
            System.out.print("\n\nSu cambio es de : " + dev + " Muchas gracias por su compra <3");
        }
       
        else if(pago < acumtotal){
            System.out.print("\n\nTiene una deuda de : " + dev + " Pesos.");
        }
        else{
            System.out.print("\n\nSu pago es exacto : " + dev + " Pesos ggracias por su compra.");
        }
    }
}