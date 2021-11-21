package Ejercicio_14;

import java.util.Scanner;

public class ImprimirDeDosEnDosHastaMil {
  public static int pedirNumero(Scanner scPrecio) {
    System.out.print("Ingrese el precio de un producto: ");
    String entradaTeclado = scPrecio.next();
    return Integer.parseInt(entradaTeclado);
  }

  public static void imprimirNumerosDeDosEnDos(int numero){
    while( numero <= 1000) {
      System.out.println("Numero: " + numero);
      numero += 2;
    }
  }

  public static void main(String[] args) {
    Scanner scNumero = new Scanner(System.in);

    int numero = pedirNumero(scNumero);

    imprimirNumerosDeDosEnDos(numero);

  }
}
