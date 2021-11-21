package Ejercicio_17;

public class Lavadora extends Electrodomestico{
  int carga = 5;

  public Lavadora() {}

  public Lavadora(int precioBase, double peso) {
    super(precioBase, peso);
  }

  public Lavadora(int precioBase, String color, char consumoEnergetico, double peso, int carga) {
    super(precioBase, color, consumoEnergetico, peso);
    this.carga = carga;
  }

  public int getCarga() {
    return carga;
  }

  @Override
  public double precioFinal() {
    double precioModificado = 0;
    double precioCarga = 0;
    if(carga>30) precioCarga = 50;
    precioModificado = super.precioFinal() + precioCarga;
    return precioModificado;
  }
}
