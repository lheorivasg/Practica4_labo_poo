/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 */
public class OperacionArreglo {
    /**
     * Metodo que calcula el promedio de la suma de los elementos de un arreglo
     * @param a Es el arreglo que se usara para calcular el promedio de sus elementos
     * @return Regresa el cociente de la suma de los elementos del arreglo dividido entre el tamaño del arreglo. En caso de ser un arreglo de tamaño vacio (tamaño 0) devuelve 0
     */
    public double calcularPromedio(int[] a){
        int s=0;
        for(int i=0; i<a.length; i++){
        s=s+a[i];
        }
        if(a.length==0) return 0;
        return (double)s/a.length;
    } 
    
    /**
     * Metodo para Obtener todos los elementos de un arreglo que sean mayores al promedio de la suma de todos los elementos del arreglo
     * Se calcula el promedio como en el metodo anterior, luego se usa para comparar los elementos que son mayores, si los son,
     * se guardan en un arreglo nuevo que tiene un tamaño igual a la cantidad de elementos mayores al promedio.
     * @param a Es el arreglo que se usara para obtener los elementos mayores al promedio
     * @return un arreglo con los elementos que son mayores al promedio
     */
    public int[] obtenerMayoresPromedio(int[] a){
       int s=0, p, idx=0; 
       for(int i=0; i<a.length; i++){       
            s=s+a[i];
        }
        p=s/a.length;               //se calcula el promedio igual que el metodo anterior
        
        int conteo = 0;
        for (int num : a) {
            if (num > p) {
                conteo++;
            }
        }
        int[] mayores = new int[conteo];
        int index = 0;
        for (int num : a) {
            if (num > p) {
                mayores[index++] = num;
            }
        }
        return mayores;
    }
    
    /**
     * Metodo para insertar un elemento en un arreglo.
     * Inserta un elemento nuevo al arreglo en una posicion dada y recorre los demas elementos a la derecha.
     * @param a Arreglo que se usara para insertar un elemento en el.
     * @param e Elemento que se desea insertar en el arreglo
     * @param p Posicion del arreglo en la que se desea insertar el elemento. Debe ser una posicion que exista en el arreglo.
     * @return Devuelve Un arreglo con el elemento insertado en la posicion deseada, ademas de sus elementos anteriores.
     */
    public int[] insertar(int[] a, int e, int p){
        if (p < 0 || p > a.length) {
            throw new IllegalArgumentException("La posición no es válida.");
        }
       
        int[] nuevoArreglo = new int[a.length + 1];
        for (int i = 0; i < p; i++) {
            nuevoArreglo[i] = a[i];
        }
        nuevoArreglo[p] = e;
        for (int i = p; i < a.length; i++) {
            nuevoArreglo[i + 1] = a[i];
        }

        return nuevoArreglo;
    }
    
    /**
     * Metodo para sumar los elementos que se encuentran en las posiciones impares de un arreglo a partir de una posicion dada.
     * Se da una posicin a partir de la que se desean contar los elementos impares.
     * @param a Es el arreglo que se usara para el calculo de la suma.
     * @param p Es la posicion desde donde se empezara a contar.
     * @return  Devuelve un entero con la suma de los elementos que se encuentran en las posiciones impares a partir de la posicion dada del arreglo.
     */
    public int sumarPosicionesImpares(int[] a, int p){
        int s=0;
        for(int i=p; i<a.length ; i++){
            if(i%2 != 0){
            s=s+a[i];
            }
        }
        return s;
    }
    
    /**
     * Metodo para ordenar un arreglo. Utiliza el algoritmo de ordenamiento por insercion.
     * El algoritmo de ordenamiento por insercion recorre el arreglo elemento por elemento, 
     * tomando cada valor y colocándolo en su posición correcta al desplazar hacia la derecha los elementos mayores.
     * @param a Es el arreglo que se desea ordenar.
     * @return  Devuelve el arreglo con sus elementos ordenados de menor a mayor.
     */
    public int[] ordenarArreglo(int[] a) {
        int i, j, actual;
        //ordenamiento por inserción
        for (i = 1; i < a.length; i++) {
            actual = a[i];
            for (j = i; j > 0 && a[j - 1] > actual; j--) {
                a[j] = a[j - 1];
            }
            a[j] = actual;
        }
        return a;
    }
    
}
