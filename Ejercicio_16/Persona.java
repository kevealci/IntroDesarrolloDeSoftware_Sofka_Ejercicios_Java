package Ejercicio_16;

public class Persona {
  private final int MENORVEINTE = -1;
  private final int MENORPESOIDEAL = 0;
  private final int SOBREPRESO = 1;
  private final int MAYORDEEDAD = 18;
  private final char HOMBRE = 'H';
  private final char MUJER = 'M';
  private final char SEXO;
  private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
  private String nombre;
  private String DNI;
  private double peso;
  private double altura;
  private int edad;

  private boolean comprobarSexo(char sexo) {
    if( sexo == HOMBRE || sexo == MUJER) {
      return true;
    }
    return false;
  }

  private String generarOchoCifras() {
    int min = 10000000;
    int max = 99999999;
    String numeroString = "";
    int numeroRandom;
    int longitudNumero;
    boolean bandera = true;

    while (bandera) {
      numeroRandom =(int) (Math.random()*( (max - min + 1) + min));
      numeroString = String.valueOf(numeroRandom);
      longitudNumero = numeroString.length();
      if( longitudNumero == 8 ) {
        bandera = false;
      }
    }

    return numeroString;
  }

  private String obtenerLetra(String numeroString){
    int indiceLetra = Integer.parseInt(numeroString) % 23;
    char caracter = LETRAS.charAt(indiceLetra);
    return  String.valueOf(caracter);
  }

  private String generarDNI() {
    StringBuffer dni = new StringBuffer();
    String numeroOchoCifras = generarOchoCifras();
    String letra = obtenerLetra(numeroOchoCifras);
    dni.append(numeroOchoCifras);
    dni.append(letra);
    return dni.toString();
  }

  public Persona() {
    this.nombre = "";
    this.edad = 0;
    this.SEXO = 'H';
    this.peso = 0.0;
    this.altura = 0.0;
    this.DNI = generarDNI();
  }

  public Persona(String nombre, int edad, char sexo) {
    this.nombre = nombre;
    this.edad = edad;
    if(comprobarSexo(sexo)){
      this.SEXO = sexo;
    }else {
      this.SEXO = 'H';
    }
    this.peso = 0.0;
    this.altura = 0.0;
    this.DNI = generarDNI();
  }

  public Persona(String nombre, int edad, char sexo, double peso, double altura) {
    this.nombre = nombre;
    this.edad = edad;
    if(comprobarSexo(sexo)){
      this.SEXO = sexo;
    }else {
      this.SEXO = 'H';
    }
    this.peso = peso;
    this.altura = altura;
    this.DNI = generarDNI();
  }

  public int calcularIMC() {
    double operacion = peso / Math.pow(altura,2);

    if( operacion < 20 ) {
      return MENORVEINTE;
    }
    if ( operacion > 25 ) {
      return SOBREPRESO;
    }
    return MENORPESOIDEAL;
  }

  public boolean esMayorDeEdad() {
    return edad >= MAYORDEEDAD;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  @Override
  public String toString() {
    return "Persona{" +
            "SEXO=" + SEXO +
            ", nombre='" + nombre + '\'' +
            ", DNI='" + DNI + '\'' +
            ", peso=" + peso +
            ", altura=" + altura +
            ", edad=" + edad +
            '}';
  }

}
