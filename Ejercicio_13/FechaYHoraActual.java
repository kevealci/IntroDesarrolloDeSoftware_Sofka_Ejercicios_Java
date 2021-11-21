package Ejercicio_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FechaYHoraActual {

  public static void main(String[] args) {
    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("(yyyy/MM/dd/) (HH:mm:ss)");
    LocalDateTime dateTime = LocalDateTime.now();

    System.out.println(dateTime.format(formateador));

  }
}
