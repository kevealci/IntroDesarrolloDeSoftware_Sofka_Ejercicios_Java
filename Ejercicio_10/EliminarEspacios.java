package Ejercicio_10;

import java.util.Scanner;

public class EliminarEspacios {
  public static String pedirFrase(Scanner scFrase) {
    System.out.print("Ingrese una frase: ");
    return scFrase.nextLine();
  }

  public static String reemplazarCharacter(String frase, String vocalVieja, String vocalNueva) {
    return frase.replace(vocalVieja,vocalNueva);
  }

  public static void main(String[] args) {
    Scanner scFrase = new Scanner(System.in);
    String fraseTeclado = pedirFrase(scFrase);
    String fraseSinEspacios = reemplazarCharacter(fraseTeclado," ", "");
    System.out.println("Frase sin espacios: " + fraseSinEspacios);
  }
}
