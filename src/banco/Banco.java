/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author alexg
 */
import java.util.Scanner;
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String realizarotraop="Si";
        
        Cuenta cajero=new Cuenta();
        System.out.println("Bienvendio a AleBank.");
        System.out.println("¿Eres cliente nuestro? Seleccionar SI o NO");
        Scanner a=new Scanner(System.in);
        String elegir=a.nextLine();
        
        if(elegir.equalsIgnoreCase("SI")){
            cajero.accederCuenta();
        }
        if(elegir.equalsIgnoreCase("NO")){
            System.out.println("Crea tu cuenta ahora:");
            cajero.crearCuenta();
        }
        while(realizarotraop.equalsIgnoreCase("Si")){
        System.out.println("¿Qué quieres hacer?:");
        System.out.println("--Ver informacion de mi cuenta--");
        System.out.println("--Ingresar efectivo--");
        System.out.println("--Editar cuenta--");
        System.out.println("--Mostrar saldo--");
        System.out.println("--Retirar efectivo--");
        String elegirMenu=a.nextLine();
        if(elegirMenu.equalsIgnoreCase("ver informacion de mi cuenta")){
            cajero.verInfoCuenta();
        }
        if(elegirMenu.equalsIgnoreCase("ingresar efectivo")){
            cajero.ingresarEfectivo();

        }

        if(elegirMenu.equalsIgnoreCase("retirar efectivo")){
            cajero.retirarEfectivo();
   
        }
        if(elegirMenu.equalsIgnoreCase("editar cuenta")){
            cajero.editarCuenta();
        }
        
        if(elegirMenu.equalsIgnoreCase("mostrar saldo")){
            System.out.println("Tu saldo es: "+cajero.mostrarSaldo());
        }
        System.out.println("¿Quieres realizar otra operacion? Por favor, elige con Si o No");       
           realizarotraop=a.nextLine();
           if(realizarotraop.equalsIgnoreCase("No")){
               System.out.println("¡Hasta la proxima!");
           }
        }
       
        }
    }
    

