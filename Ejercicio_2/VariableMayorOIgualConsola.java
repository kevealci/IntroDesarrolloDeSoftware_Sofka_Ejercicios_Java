package Ejercicio_2;

import java.util.Scanner;

public class VariableMayorOIgualConsola {
  public static String variableMayor(int variableA, int variableB){
    return variableA > variableB ? ">" : "<";
  }

  public static boolean isEqual(int variableA, int variableB){
    return variableA == variableB;
  }

  public static int pedirNumero(Scanner scNumero) {
    System.out.print("Ingrese un número: ");
    String entradaTeclado = scNumero.next();
    return Integer.parseInt(entradaTeclado);
  }

  public static void imprimirResultado(int variableA, int variableB, String resultado){
    System.out.println("VariableA: " + variableA + " " + resultado + " VariableB: " + variableB);
  }

  public static void main(String[] args) {
    Scanner scNumero = new Scanner(System.in);

    int variableA = pedirNumero(scNumero);
    int variableB = pedirNumero(scNumero);

    if (isEqual(variableA, variableB)) {
      imprimirResultado(variableA, variableB, "=");
    }else {
      String resultado = variableMayor(variableA,variableB);
      imprimirResultado(variableA, variableB, resultado);
    }

  }
}
