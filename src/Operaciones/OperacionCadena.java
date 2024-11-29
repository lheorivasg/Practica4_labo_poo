/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 */
public class OperacionCadena {
    
    
    /**
     * Metodo que identifica los caracteres similares que tienen dos cadenas
     * @param cadena1 Primera cadena
     * @param cadena2 Segunda cadena
     * @return Numero de coincidencias en los caracteres
     */
    public int contarCoincidencias (String cadena1, String cadena2){
        int numCoincidencias = 0;
        
        for(int i = 0; i < Math.min(cadena1.length(), cadena2.length()); i++){
            if(cadena1.charAt(i) == cadena2.charAt(i)){
                numCoincidencias++;
            } 
        }
        return numCoincidencias;
    }
    
    
    /**
     * Se calcula la similitud entre dos cadenas por medio la formula : Número de caracteres coincidentes / Longitud de la cadena más larga
     * @param cadena1 Primera cadena
     * @param cadena2 Segunda cadena
     * @return el nivel de similitud 0 a 1
     */
    public String calcularSimilitud(String cadena1, String cadena2){

        double similitud = (double) contarCoincidencias(cadena1, cadena2) / Math.max(cadena1.length() , cadena2.length() );        
        
        return String.format("%.3f", similitud);
    }
    
    
    /**
     * Conteo de letras minusculas en una cadena
     * @param cadena Cadena para analizar
     * @param minusculas letras minusculas
     * @return Numero de letras minusculas en la cadena
     */
    public int contarMinusculas (String cadena){
        int numMinusculas = 0;
        
        for(int i = 0; i < cadena.length(); i++ ){
            char c = cadena.charAt(i);
            if(c >= 'a' && c <= 'z'){
                numMinusculas++;
            }
        }
        return numMinusculas;
    }
    
    
    
    /**
     * Conteo de consonantes en una cadena
     * @param cadena Cadena para analizar
     * @param consonantes letras consonantes
     * @return Numero de consonantes en la cadena
     */
    public int contarConsonantes (String cadena){
        int numConsonantes = 0;
        String vocales = "aeiouAEIOU";
        
        for(int i = 0; i < cadena.length(); i++ ){
            char c = cadena.charAt(i);
            if(Character.isLetter(c)){
                if(vocales.indexOf(c) == -1){
                    numConsonantes++;
                }
            }
        }
        return numConsonantes;
    }
    
    
    
    /**
     * Cadena para convertir una cadena con respecto a las siguientes condiciones:
     * Se sustituye A por 4
     * Se sustituye E por 3
     * Se sustituye I por 1
     * Se sustituye O por 0
     * @param cadena Cadena por analizar
     * @return Cadena convertida
     */
    public String convertirCadena (String cadena){
        StringBuilder nuevaCadena = new StringBuilder();
        
        for(int i = 0; i < cadena.length(); i++){
            char c = cadena.charAt(i);
            
            switch(c){
                case 'A' : nuevaCadena.append('4'); break;
                case 'E' : nuevaCadena.append('3'); break;
                case 'I' : nuevaCadena.append('1'); break;
                case 'O' : nuevaCadena.append('0'); break;
                default: nuevaCadena.append(c);
            }
        }
        
        
        return nuevaCadena.toString();
    }
    
    
    /**
     * Valida si una cadena es un palíndromo (ignorando espacios y mayusculas/minusculas)
     * @param cadena Cadena por validar
     * @return Se imprime True si la cadena palindromo, sino se imprime False
     */
    public boolean validarPalindromo (String cadena){
        String cadenaLimpia = cadena.replaceAll("\\s+", "").toLowerCase();
        
        int longitud = cadenaLimpia.length();
        
        for(int i = 0; i < longitud/2 ; i++){
            if(cadenaLimpia.charAt(i)!= cadenaLimpia.charAt(longitud - i -1)){
                return false;
            }
        }
        return true;
    }
    
    
}
