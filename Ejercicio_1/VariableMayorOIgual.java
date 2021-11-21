package Ejercicio_1;

public class VariableMayorOIgual {

  public static String variableMayor(int variableA, int variableB){
    return variableA > variableB ? ">" : "<";
  }

  public static boolean isEqual(int variableA, int variableB){
    return variableA == variableB;
  }

  public static void imprimirResultado(int variableA, int variableB, String resultado){
    System.out.println("VariableA: " + variableA + " " + resultado + " VariableB: " + variableB);
  }

  public static void main(String[] args) {

    int variableA = 20;
    int variableB = 20;

    if (isEqual(variableA, variableB)) {
      imprimirResultado(variableA, variableB, "=");
    }else {
      String variableMayor = variableMayor(variableA,variableB);
      imprimirResultado(variableA, variableB, variableMayor);
    }

  }
}
