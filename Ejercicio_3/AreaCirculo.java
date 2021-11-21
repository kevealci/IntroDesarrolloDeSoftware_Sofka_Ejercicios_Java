package Ejercicio_3;

import java.util.Scanner;

public class AreaCirculo {

  public static double pedirRadio(Scanner scRadio) {
    System.out.print("Ingrese el radio del circulo: ");
    String entradaTeclado = scRadio.next();
    return Double.parseDouble(entradaTeclado);
  }

  public static double areaCirculo(double radio) {
    return Math.PI * Math.pow(radio,2);
  }

  public static void imprimirResultado(double radio, double areaCirculo) {
    System.out.println("El area del circulo con radio " + radio + " es: " + areaCirculo);
  }

  public static void main(String[] args) {
    Scanner scRadio = new Scanner(System.in);

    double radio = pedirRadio(scRadio);
    double areaCirculo = areaCirculo(radio);

    imprimirResultado(radio,areaCirculo);

  }
}
