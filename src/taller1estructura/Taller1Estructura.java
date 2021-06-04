/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1estructura;

/**
 *
 * @author robin
 */
public class Taller1Estructura {

    /**
     * @param args the command line arguments
     */
    public static char firstMayus(String oracion){
    return firstMayusRecursivo(oracion, 0, oracion.length());
    }
    private static char firstMayusRecursivo(String oracion, int inic, int fin){
        if((inic<fin) && (Character.isUpperCase(oracion.charAt(inic)))){
            return oracion.charAt(inic);
        }
        else if (inic<fin){
            return firstMayusRecursivo(oracion, inic+1, fin);
        }
        return (char)0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String pal = "naalabra";
       
        System.out.println(firstMayus(pal));
    }
    
}
