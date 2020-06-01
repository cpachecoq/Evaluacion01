/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.Scanner;
import java.util.Collection;

/**
 *
 * @author linar
 */
public class VistaElectrodomestico {
    
    Scanner e=new Scanner(System.in);
    
    public Electrodomestico ingresarElectrodomestico(){
        
        System.out.println("   Ingreso de datos   ");
        System.out.println("Ingrese Codigo: ");
        int codigo=e.nextInt();
        System.out.println("Ingrese Decripcion: ");
        String descripcion=e.next();
        System.out.println("Ingrese Precio Base: ");
        double precioBase=e.nextDouble();
        System.out.println("Ingrese Color ");
        String color=e.next();
        System.out.println("Ingrese Consumo Energetico ");
        String consumoEnergetico=e.next();
        System.out.println("Ingrese peso ");
        int peso=e.nextInt();
        return new Electrodomestico(codigo, descripcion, precioBase, color, consumoEnergetico, peso);
    }
    

    public Lavadora ingresarLavadora(){
        
        int carga=e.nextInt();
        return new Lavadora( );
    }
   
    public Television ingresarTelevision(){
        
        int resolucion=e.nextInt();
        boolean puertoHDMI=e.nextBoolean();
        return new Television( );
        
    }
}
