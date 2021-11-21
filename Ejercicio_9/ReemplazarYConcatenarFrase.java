package Ejercicio_9;

import java.util.Scanner;

public class ReemplazarYConcatenarFrase {

  public static String pedirFrase(Scanner scFrase) {
    System.out.print("Ingrese una frase: ");
    return scFrase.nextLine();
  }

  public static String concatenarFrase(String primeraFrase, String segundaFrase) {
    return primeraFrase.concat(segundaFrase);
  }

  public static String reemplazarCharacter(String frase, Character vocalVieja, Character vocalNueva) {
    return frase.replace(vocalVieja,vocalNueva);
  }

  public static void main(String[] args) {
    Scanner scFrase = new Scanner(System.in);

    String fraseDefault = "La sonrisa sera la mejor arma contra la tristeza ";

    String fraseReemplazada = reemplazarCharacter(fraseDefault,'a','e');

    System.out.println("Frase original: " + fraseDefault);
    System.out.println("Frase reemplazada: " + fraseReemplazada);

    String fraseTeclado = pedirFrase(scFrase);
    String fraseConcatenada = concatenarFrase(fraseReemplazada, fraseTeclado);

    System.out.println("Frase teclado: " + fraseTeclado);
    System.out.println("Frase concatenada: " + fraseConcatenada);
  }
}
