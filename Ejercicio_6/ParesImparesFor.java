package Ejercicio_6;

public class ParesImparesFor {
  public static boolean isPar(int numero) {
    return numero % 2 == 0;
  }

  public static  void imprimirIteraciones(int iteraciones) {
    for(int vuelta = 1; vuelta<= iteraciones; vuelta++){
      if(isPar(vuelta)){
        System.out.println("El numero " + vuelta + " es par");
      }else {
        System.out.println("El numero " + vuelta + " es impar");
      }
    }

  }

  public static void main(String[] args) {
    int iteraciones = 100;

    imprimirIteraciones(iteraciones);
  }
}
