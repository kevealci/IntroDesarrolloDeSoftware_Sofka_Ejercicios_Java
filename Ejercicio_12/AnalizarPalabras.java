package Ejercicio_12;

import java.util.Scanner;

public class AnalizarPalabras {

  public static String pedirPalabra(Scanner scFrase) {
    System.out.print("Ingrese una palabra: ");
    return scFrase.next();
  }

  public static boolean isIgual(String primeraFrase, String segundaFrase) {
    return primeraFrase.equalsIgnoreCase(segundaFrase);
  }

  public static int longitudMenor(String primeraFrase, String segundaFrase) {
    return primeraFrase.length() < segundaFrase.length() ? primeraFrase.length() : segundaFrase.length();
  }

  public static String fraseMasLarga(String primeraFrase, String segundaFrase) {
    return primeraFrase.length() > segundaFrase.length() ? primeraFrase : segundaFrase;
  }

  public static boolean isLongitudIgual(String primeraFrase, String segundaFrase) {
    return  primeraFrase.length() == segundaFrase.length();
  }

  public static String diferenciaIgualLongitud(int longitud, String primeraFrase, String segundaFrase) {
    StringBuffer diferencias = new StringBuffer();

    for(int i = 0; i<longitud; i++) {
      String letraActualPrimeraFrase = String.valueOf(primeraFrase.charAt(i));
      String letraActualSegundaFrase = String.valueOf(segundaFrase.charAt(i));
      if( !letraActualPrimeraFrase.equalsIgnoreCase(letraActualSegundaFrase)){
        diferencias.append(letraActualSegundaFrase);
      }
    }
    return diferencias.toString();
  }

  public static String diferenciaDiferenteLongitud(int longitudMenor, int longitudMayor, String fraseMasLarga) {
    StringBuffer diferencias = new StringBuffer();
    for( int i = longitudMenor ; i < longitudMayor; i++ ) {
      String letraActual = String.valueOf(fraseMasLarga.charAt(i));
      diferencias.append(letraActual);
    }
    return  diferencias.toString();
  }

  public static String encontrarDiferencia(String primeraFrase, String segundaFrase) {
    StringBuffer diferencias = new StringBuffer();

    // Se pregunta si las palabras son de igual longitud
    if (isLongitudIgual(primeraFrase, segundaFrase)) {
      int longitud = primeraFrase.length();
      diferencias.append(diferenciaIgualLongitud(longitud, primeraFrase, segundaFrase));
    } else {
      // Si las palabras son de diferentes longitudes primero se reutiliza la funcion de longitudes iguales
      // y despues se sigue iterando en la palabra mas larga para obtener el resto de caracteres diferentes

      // Obtenemos la longitud menos para poder reutilizar la funcion de longitudes iguales
      int logitudMenor =  longitudMenor(primeraFrase, segundaFrase);
      // Obtenemos las primeras diferencias hasta ese indice
      String diferenciaIgualLongitud = diferenciaIgualLongitud(logitudMenor, primeraFrase, segundaFrase);
      diferencias.append(diferenciaIgualLongitud) ;

      // Ahora iteramos la palabra mas grande desde donde nos quedamos porque desde aqui ya cuenta como diferencia
      String fraseMasLarga = fraseMasLarga(primeraFrase, segundaFrase);
      int longitudMayor = fraseMasLarga.length();

      // Obtenemos los caracteres que nos faltan de iteran en la palabra mas larga
      String diferenciaDiferenteLongitud = diferenciaDiferenteLongitud(logitudMenor, longitudMayor,fraseMasLarga) ;
      diferencias.append(diferenciaDiferenteLongitud);
    }
    return diferencias.toString();
  }

  public static void main(String[] args) {
    Scanner scPalabra = new Scanner(System.in);

    String primeraPalabra =  pedirPalabra(scPalabra);
    String segundaPalabra =  pedirPalabra(scPalabra);

    String diferenciasAConB;
    String diferenciasBConA;

    if( isIgual(primeraPalabra,segundaPalabra)) {
      System.out.println("Las palabras son iguales");
    } else {
      diferenciasAConB = encontrarDiferencia(primeraPalabra, segundaPalabra);
      diferenciasBConA = encontrarDiferencia(segundaPalabra, primeraPalabra);
      System.out.println("Las diferencias de la primera palabra "+ primeraPalabra + " con la segunda palabra " + segundaPalabra + " son: " + diferenciasAConB);
      System.out.println("Las diferencias de la segunda palabra "+ segundaPalabra + " con la primera palabra " + primeraPalabra + " son: " + diferenciasBConA);
    }
  }
}
