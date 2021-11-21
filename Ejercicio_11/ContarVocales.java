package Ejercicio_11;

import java.util.Scanner;

public class ContarVocales {

  private static boolean esVocal(char letra) {
    String string = String.valueOf(letra);
    return "aeiou".contains(string.toLowerCase());
  }

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
    int logitudConEspacio = fraseTeclado.length();
    int logitudSinEspacio = fraseSinEspacios.length();

    int numeroVocales = 0;
    char letraActual;

    for (int i = 0; i < logitudConEspacio; i++) {
      letraActual = fraseTeclado.charAt(i);
      if(esVocal(letraActual)) numeroVocales++;
    }

    System.out.println("La longitud de la frase con espacios es " + logitudConEspacio + "\nLa longitud de la frase sin espacios es " + logitudSinEspacio + "\nNumero de vocales: " + numeroVocales);

  }
}
