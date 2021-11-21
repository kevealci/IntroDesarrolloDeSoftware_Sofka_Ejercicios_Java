package Ejercicio_5;

public class ParesImparesWhile {

  public static boolean isPar(int numero) {
    return numero % 2 == 0;
  }

  public static  void imprimirIteraciones(int iteraciones) {
    while (iteraciones <= 100) {
      if(isPar(iteraciones)){
        System.out.println("El numero " + iteraciones + " es par");
      }else {
        System.out.println("El numero " + iteraciones + " es impar");
      }
      iteraciones++;
    }
  }

  public static void main(String[] args) {
    int iteraciones = 1;

    imprimirIteraciones(iteraciones);
  }

}
