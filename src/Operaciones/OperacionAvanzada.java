/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import java.lang.Math;

/**
 * Clase que se encarga de realizar operaciones avanzadas
 *
 * @author 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 * @version 1.0
 */
public class OperacionAvanzada {

    /**
     * Método que se encarga de calcular la potencia de un número
     *
     * @param A Se utiliza como base del método
     * @param B Se utiliza como exponente del método
     * @return El valor de un número A elevado al exponente B
     */
    public int elevarPotencia(int A, int B) {
        if (B == 0) {
            return 1;
        } else {
            return A * elevarPotencia(A, B - 1);
        }
    }

    /**
     * Método para conocer si dos números enteros son amigos Se realiza mediante
     * la suma de los divisores propios de cada elemento y posteriormente una
     * comparación para determinar si los dos números son amigos.
     *
     * @param A Primer elemento del método
     * @param B Segundo elemento del método
     * @return un String con el mensaje "Son amigos" en caso que A y B son
     * amigos, en caso contrario "No son amigos"
     */
    public String decidirAmigos(int A, int B) {
        int contador_A = 0;
        int contador_B = 0;

        for (int i = 1; i < A; i++) {
            if (A % i == 0) {
                contador_A += i;
            }
        }
        for (int i = 1; i < B; i++) {
            if (B % i == 0) {
                contador_B += i;
            }
        }

        if (A == contador_B && B == contador_A) {
            return "Son amigos";
        } else {
            return "No son amigos";
        }
    }

    /**
     * Método para encontrar el elemnto de la secuencia de Fibonacci Se realiza
     * mediante la regla de Finonacci Xn=Xn-1+Xn-2
     *
     * @param A Posición a encontrar
     * @return el número de la secuencia de Fibonaccio de la posición A
     */
    public int devolverFibonacci(int A) {
        if (A < 2) {
            return A;
        } else {
            return devolverFibonacci(A - 1) + devolverFibonacci(A - 2);
        }
    }

    /**
     * Método para encontrar las raíces de una ecuacion cuadrática Se realiza
     * mediante la fórmula General de segundo grado
     *
     * @param A Coeficiente X^2
     * @param B Coeficiente x
     * @param C Término independiente
     * @return Las raices obtenidas por medio de la fórmula general para
     * ecuaciones cuadráticas
     * @see #elevarPotencia(int, int) referencia a un Método de la misma
     * biblioteca
     * @see
     * <a href="https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html">
     * Clase Math de java </a>
     */
    public String obtenerRaices(int A, int B, int C) {
        double x1;
        double x2;

        double raiz = Math.sqrt(elevarPotencia(B, 2) - 4 * A * C);
        double discriminante = elevarPotencia(B, 2) - 4 * A * C;

        if (A == 0) {
            return "Indefinido";
        } else if (discriminante < 0) {
            return "Las raices son complejas";

        } else {
            x1 = (-B + raiz) / (2 * A);
            x2 = (-B - raiz) / (2 * A);
            return "X1:" + x1 + "\nX2:" + x2;
        }
    }

    /**
     *Método para validar si un número es del tipo Amstrong
     * 
     * @param A
     * @return En caso que sea un número de Amstrong regresa el mismo número, en caso contrario muetra el mensaje "No es número de Amstrong"
     * @see #elevarPotencia(int, int) referencia a un Método de la misma
     * bibliotec
     */
    public String validarNumeroAmstrong(String A) {
        int numero = Integer.parseInt(A);
        int longitud = A.length();
        int suma = 0;

        for (int i = 0; i < A.length(); i++) {
            int digito = Character.getNumericValue(A.charAt(i));
            suma += elevarPotencia(digito, longitud);
        }
        if (suma == numero) {
            return A;
        } else {
            return "No es numero de Amstrong";
        }
    }
}
