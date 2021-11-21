package Ejercicio_4;

import java.util.Scanner;

public class CalcularPrecioConIVA {

  public static final double IVA = 0.21;

  public static double pedirPrecio(Scanner scPrecio) {
    System.out.print("Ingrese el precio de un producto: ");
    String entradaTeclado = scPrecio.next();
    return Double.parseDouble(entradaTeclado);
  }

  public static double precioFinal(double precio) {
    return precio + (precio * IVA);
  }

  public static void imprimirResultado(double precioConIVA) {
    System.out.println("El precio final del producto con IVA del "+ IVA*100 + "% es: " + precioConIVA);
  }

  public static void main(String[] args) {
    Scanner scPrecio = new Scanner(System.in);

    double precio = pedirPrecio(scPrecio);
    double precioConIVA = precioFinal(precio);

    imprimirResultado(precioConIVA);
  }
}
