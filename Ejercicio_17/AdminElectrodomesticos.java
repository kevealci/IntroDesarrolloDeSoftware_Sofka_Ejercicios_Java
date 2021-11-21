package Ejercicio_17;

public class AdminElectrodomesticos {
  public static void main(String[] args) {
    double sumaElectrodomesticos = 0;
    double sumaLavadoras = 0;
    double sumaTelevisiones = 0;
    int contadorElemento = 0;
    Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];
    listaElectrodomesticos[0] = new Electrodomestico();
    listaElectrodomesticos[1] = new Electrodomestico(122, 44);
    listaElectrodomesticos[2] = new Electrodomestico(265, "negro", 'A', 30);
    listaElectrodomesticos[3] = new Lavadora();
    listaElectrodomesticos[4] = new Lavadora(315, 74);
    listaElectrodomesticos[5] = new Lavadora(111, "azul", 'B', 60, 50);
    listaElectrodomesticos[6] = new Lavadora(66, 55);
    listaElectrodomesticos[7] = new Television();
    listaElectrodomesticos[8] = new Television(117, 47);
    listaElectrodomesticos[9] = new Television(323, "negro", 'C', 40, 45, true);

    for (Electrodomestico elemento : listaElectrodomesticos) {

      System.out.println("El precio final del item " + contadorElemento);
      System.out.println(elemento.precioFinal());
      sumaElectrodomesticos += elemento.precioFinal();
      if (elemento instanceof Lavadora){
        sumaLavadoras += elemento.precioFinal();
      }
      else if (elemento instanceof Television) {
        sumaTelevisiones += elemento.precioFinal();
      }
      contadorElemento++;
    }

    System.out.println("La suma total de los electrodómesticos es: " + sumaElectrodomesticos);
    System.out.println("La suma total de las lavadoras es: " + sumaLavadoras);
    System.out.println("La suma total de los televisores es: " + sumaTelevisiones);

  }
}
