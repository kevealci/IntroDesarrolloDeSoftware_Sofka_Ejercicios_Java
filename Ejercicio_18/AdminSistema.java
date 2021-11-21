package Ejercicio_18;

import java.util.ArrayList;
import java.util.List;


public class AdminSistema {
  public static void main(String[] args) {
    int contadorSeries = 0;
    int contadorVideojuegos = 0;
    List<Serie> listaSeries = new ArrayList<>();
    listaSeries.add(new Serie("Naruto Shippuden", "Masashi Kishimoto"));
    listaSeries.add(new Serie("CowBoy Bebop", "Hajime Yatate"));
    listaSeries.add(new Serie());
    listaSeries.add(new Serie("Full Metal Alchemist", 1, "Shonen", "Hiromu Arakawa"));
    listaSeries.add(new Serie("Hunter x Hunter", 1, "Shonen", "Yoshihiro Togashi"));

    List<Videojuego> listaVideojuego = new ArrayList<>();
    listaVideojuego.add(new Videojuego("World of Warcraft", 10000));
    listaVideojuego.add(new Videojuego("Team Fight Tactics", 12222, "Estrategia", "Riot Games"));
    listaVideojuego.add(new Videojuego());
    listaVideojuego.add(new Videojuego("League of Legends", 15000, "Acción", "Riot Games"));
    listaVideojuego.add(new Videojuego("Call of Duty", 7 , "Acción", "Activision"));

    listaSeries.get(1).entregar();
    listaSeries.get(4).entregar();
    listaVideojuego.get(0).entregar();
    listaVideojuego.get(1).entregar();
    listaVideojuego.get(2).entregar();

    for (Serie serie : listaSeries){
      if(serie.isEntregado()==true){
        contadorSeries += 1;
        serie.devolver();
      }
    }
    for (Videojuego videojuego : listaVideojuego) {
      if(videojuego.isEntregado()== true){
        contadorVideojuegos +=1;
        videojuego.devolver();
      }
    }
    System.out.println("\n-------------------ENTREGADOS----------------------");
    System.out.println("El numero de series entregadas es: " + contadorSeries);
    System.out.println("El numero de videojuegos entregados es: " + contadorVideojuegos);

    System.out.println("\n---SERIE CON MAS TEMPORADAS---");
    System.out.println(listaSeries.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));

    System.out.println("\n---VIDEOJUEGO CON MAS HORAS---");
    System.out.println(listaVideojuego.stream().sorted((x, y)->y.compareTo(x)).findFirst().toString().replace("Optional[","").replace("]",""));

  }

}