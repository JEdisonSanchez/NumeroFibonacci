/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerofibonacci;

/**
 *
 * @author Edison
 */
public class Fibonacci {

  private int numeroParaCalcular;
  private int numeroResultante;

  public Fibonacci(int numeroParaCalcular) {
    this.numeroParaCalcular = numeroParaCalcular;
  }

  /**
   * @return the numeroParaCalcular
   */
  public int getNumeroParaCalcular() {
    return numeroParaCalcular;
  }

  /**
   * @param numeroParaCalcular the numeroParaCalcular to set
   */
  public void setNumeroParaCalcular(int numeroParaCalcular) {
    this.numeroParaCalcular = numeroParaCalcular;
  }

  /**
   * @return the numeroResultante
   */
  public int getNumeroResultante() {
    return numeroResultante;
  }

  /**
   * @param numeroResultante the numeroResultante to set
   */
  public void setNumeroResultante(int numeroResultante) {
    this.numeroResultante = numeroResultante;
  }
  
  /**
   * Método que permiter mostrar la serie Fibonacci del numero ingresado
   */
  public void imprimirSerieFibonacci() {
    System.out.println("-----------------------");
    System.out.println("La serie fibonacci para el numero " + this.numeroParaCalcular + " es: ");
    for (int i = 0; i <= this.numeroParaCalcular; i++) {
      System.out.print(this.calcularFibonacci(i) + "  ");
      this.numeroResultante = this.calcularFibonacci(i);
    }
    System.out.println();
    System.out.println("-----------------------");
  }
  
  /**
   * Método que permiter mostrar si el ultimo número de la serie es primo
   */
  public void imprimirPrimo() {
    if (this.esPrimo(this.numeroResultante)) {
      System.out.println(this.numeroResultante + " es primo");
    } else {
      System.out.println(this.numeroResultante + " no es primo");
    }
  }
  
  /**
   * Metodo que al enviarle por parametro un número, nos devuelve un valor
   * boolean el cual indica si es primo (true) o no es primo (false)
   * @param 
   */
  private boolean esPrimo(int numero) {
    int contador = 0;
    boolean esPrimo = false;
    for (int i = 1; i <= numero; i++) {
      if (numero % i == 0) {
        contador +=1;
      }
    }
    if (contador == 2) {
      esPrimo = true;
    }
    return esPrimo;
  }
  
  /**
   * Metodo que al enviarle por parametro un número, nos devuelve el 
   * siguiente número de la serie fibonacci
   */
  private int calcularFibonacci(int numero) {
    switch (numero) {
      case 0:
        return 0;
      case 1:
        return 1;
      default:
        return this.calcularFibonacci(numero - 1) + this.calcularFibonacci(numero - 2);
    }
  }
}
