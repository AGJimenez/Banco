/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author alexg
 */
import java.util.Scanner;
public class Cuenta {
    
    //atributos
    private String nombre;
    private String cuenta;
    private double saldo;
    private double limitenegativo=-50;
    private String dni;
    

public Cuenta(){
    this.nombre=" ";
    this.saldo=0;
    this.cuenta=" ";
    this.limitenegativo=-50;
    this.dni="";
}

public Cuenta(String nombre, String cuenta, double saldo, double limitenegativo){
    this.nombre=nombre;
    this.saldo=saldo;
    this.cuenta=cuenta;
    this.limitenegativo=limitenegativo;
}

public double mostrarSaldo(){
    return saldo;

}

public void ingresarEfectivo(){
    Scanner a=new Scanner(System.in);
    double ingreso=a.nextDouble();
    saldo=saldo+ingreso;
}
public void retirarEfectivo(){
    Scanner a=new Scanner(System.in);
    double retirada=a.nextDouble();
    saldo=saldo-retirada;
    
    if(saldo<-50){
        System.out.println("No se ha podido realizar la operación, límite alcanzado");
    }
    
}

public void crearCuenta(){
    System.out.println("Introduce tu nombre");
    Scanner name=new Scanner(System.in);
    String introducirname=name.nextLine();
    System.out.println("Introduce tu DNI");
    String introducirdni=name.nextLine();
    
    this.dni=introducirdni;
    this.nombre=introducirname;
    
    System.out.println("¡Cuenta creada con éxito! Estos son tus datos:");
    System.out.println("Nombre: "+introducirname+" DNI: "+introducirdni);
}

public void verInfoCuenta(){
    System.out.println("Tu saldo actual es: "+saldo);
     System.out.println("Nombre: "+nombre);
      System.out.println("DNI: "+dni);
}

public void editarCuenta(){
    System.out.println("Por favor, confirma que quieres editar tu cuenta");
    System.out.println("Selecciona -si-, de lo contrario, saldras del editor");
    
    Scanner a=new Scanner(System.in);
    String confirmacion=a.nextLine();
    
   if(confirmacion.equalsIgnoreCase("Si")){
       System.out.println("Introduce tu nuevo nombre");
    String modNombre=a.nextLine();
       System.out.println("Introduce tu nuevo DNI");
    String modDni=a.nextLine();
    
    this.nombre=modNombre;
    this.dni=modDni;
    System.out.println("Nombre introducido: "+modNombre+" |DNI introducido: "+modDni);
}
   else{
       System.out.println("Saliendo del editor");
   }
}

public String getNombre(){
    return nombre;
}

public void accederCuenta(){
     Scanner nom=new Scanner(System.in);
     System.out.println("Simulacion de contraseña:");
     String registro=nom.nextLine();
    
    System.out.println("Introduce tus credenciales");
    System.out.println("Nombre:");
    String nombreint=nom.nextLine();
    System.out.println("DNI:");
    String dniInt=nom.nextLine();
    this.nombre=nombreint;
    this.dni=dniInt;
    System.out.println("Introduce tu contrasenia");
    String password=nom.nextLine();
    if(password.equals(registro)){
        System.out.println("Bienvenido/a "+nombreint);
    }
    
    else{
        System.out.println("Contraseña incorrecta");
        }
        
    }
    
    
    
}
