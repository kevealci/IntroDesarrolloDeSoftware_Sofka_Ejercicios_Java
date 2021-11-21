package Ejercicio_8;

import java.util.Scanner;

public class DiaLaboral {

  public static String pedirDia(Scanner scDia) {
    System.out.print("Ingrese día de la semana: ");
    String entradaTeclado = scDia.next();
    return entradaTeclado.toLowerCase();
  }

  public static String tipoDeDia(String dia) {
    switch (dia) {
      case "lunes":
      case  "martes":
      case  "miercoles":
      case  "jueves":
      case "viernes":
        return "día Laborable.";
      case "sabado":
      case "domingo":
        return "fin de semana.";
      default:
        return "día no válido.";
    }
  }

  public static void imprimirResultado(String dia, String tipoDeDia) {
    System.out.println("El " + dia + " es un " + tipoDeDia);
  }

  public static void main(String[] args) {
    Scanner scDia = new Scanner(System.in);

    String dia = pedirDia(scDia);
    String tipoDeDia = tipoDeDia(dia);

    imprimirResultado(dia, tipoDeDia);
  }
}
