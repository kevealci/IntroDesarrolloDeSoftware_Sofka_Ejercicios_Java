package Ejercicio_16;

import java.util.Scanner;

public class AdminPersona {

  public static int ingresarEdad(Scanner scEdad) {
    System.out.print("Ingresa edad: ");
    return scEdad.nextInt();
  }

  public static String ingresarNombre(Scanner scNombre) {
    System.out.print("Ingrese nombre: ");
    return scNombre.next();
  }

  public static char ingresarSexo(Scanner scSexo) {
    System.out.print("Ingrese sexo ( H | M ): ");
    return scSexo.next().charAt(0);
  }

  public static double ingresarPeso(Scanner scPeso) {
    System.out.print("Ingrese peso (Kg), si va a poner decimales usar coma no punto: ");
    return scPeso.nextDouble();
  }

  public static double ingresarAltura(Scanner scAltura) {
    System.out.print("Ingrese altura (m), si va a poner decimales usar coma no punto: ");
    return scAltura.nextDouble();
  }

  public static void imprimirEstadoDePeso(int numero){
    if ( numero == 1 ) {
      System.out.println("\nLa persona tiene sobrepeso.");
    }
    if ( numero == 0) {
      System.out.println("\nLa persona esta por debajo del peso ideal.");
    }
    if( numero == -1 ) {
      System.out.println("\nLa persona tiene el peso ideal.");
    }
  }

  public static void imprimirMayorDeEdad(boolean mayorDeEdad) {
    if( mayorDeEdad) {
      System.out.println("\nLa persona es mayor de edad");
    } else {
      System.out.println("\nLa persona es menor de edad");
    }
  }

  public static void main(String[] args) {
    Scanner scDato =  new Scanner(System.in);

    String nombre1 = ingresarNombre(scDato);
    //scDato.next();
    int edad1 = ingresarEdad(scDato);
    //scDato.next();
    char sexo1 = ingresarSexo(scDato);
    //scDato.next();
    double peso1 = ingresarPeso(scDato);
    //scDato.next();
    double altura1 = ingresarAltura(scDato);

    Persona persona1 = new Persona(nombre1,edad1,sexo1,peso1,altura1);

    Persona persona2 = new Persona(nombre1,edad1,sexo1);

    Persona persona3 = new Persona();

    persona3.setNombre("Eduardo");
    persona3.setEdad(35);
    persona3.setPeso(100.0);
    persona3.setAltura(1.65);

    imprimirEstadoDePeso(persona1.calcularIMC());
    imprimirEstadoDePeso(persona2.calcularIMC());
    imprimirEstadoDePeso(persona3.calcularIMC());

    imprimirMayorDeEdad(persona1.esMayorDeEdad());
    imprimirMayorDeEdad(persona2.esMayorDeEdad());
    imprimirMayorDeEdad(persona3.esMayorDeEdad());

    System.out.println("\n"+persona1);
    System.out.println(persona2);
    System.out.println(persona3);
  }
}
