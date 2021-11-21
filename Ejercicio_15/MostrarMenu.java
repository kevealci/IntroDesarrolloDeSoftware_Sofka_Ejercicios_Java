package Ejercicio_15;

import java.util.Scanner;

public class MostrarMenu {
  public static String pedirNumero(Scanner scPrecio) {
    System.out.print("Ingrese una opcion: ");
    return scPrecio.next();
  }

  public static void imprimirMenu() {
    System.out.println("****** GESTION CINEMATOGRÁFICA ********");
    System.out.println("1-NUEVO ACTOR");
    System.out.println("2-BUSCAR ACTOR");
    System.out.println("3-ELIMINAR ACTOR");
    System.out.println("4-MODIFICAR ACTOR");
    System.out.println("5-VER TODOS LOS ACTORES");
    System.out.println("6- VER PELICULAS DE LOS ACTORES");
    System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
    System.out.println("8-SALIR");
  }

  public static void main(String[] args) {

    Scanner scNumero = new Scanner(System.in);

    boolean bandera = true;
    String opcion;

    while (bandera) {
      imprimirMenu();

      opcion = pedirNumero(scNumero);

      switch (opcion) {
        case "1":
        case "2":
        case "3":
        case "4":
        case "5":
        case "6":
        case "7":
          break;
        case "8":
          bandera = false;
          break;
        default:
          System.out.println("OPCION INCORRECTO");
      }
    }
  }
}
