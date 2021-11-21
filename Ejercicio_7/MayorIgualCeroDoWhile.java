package Ejercicio_7;

import java.util.Scanner;

public class MayorIgualCeroDoWhile {

  public static double pedirNumero(Scanner scNumero) {
    System.out.print("Ingrese el número: ");
    String entradaTeclado = scNumero.next();
    return Double.parseDouble(entradaTeclado);
  }

  public static boolean isMayorOIgual(double numero) {
    return numero >= 0;
  }

  public static void imprimirResultado(double numero){
    System.out.println("El numero mayor o igual a cero es: " + numero);
  }

  public static void main(String[] args) {
    boolean bandera ;
    double numero;
    String entradaTeclado;
    Scanner scNumero = new Scanner(System.in);
    do
    {
      numero = pedirNumero(scNumero);
      bandera = isMayorOIgual(numero);

    }while (!bandera);

    imprimirResultado(numero);
  }
}
