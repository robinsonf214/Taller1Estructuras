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
    
    public static String replaceOA(String oracion, int n){
        
        return replaceO(oracion, n, 0, oracion.length());
    }
    
    private static String replaceO(String oracion, int n,int ini, int fin){
        if((ini<fin) && (n>0)){
            if((oracion.charAt(ini) == 'O') || (oracion.charAt(ini) == 'o')){
                if (Character.isUpperCase(oracion.charAt(ini))){
                    String nuevo = new StringBuilder(oracion).replace(ini, ini+1, "A").toString();
                    return replaceO(nuevo, n-1, ini+1, fin);
                }
                else{
                    String nuevo = new StringBuilder(oracion).replace(ini, ini+1, "a").toString();
                    return replaceO(nuevo, n-1, ini+1, fin);
                }     
            }
            else{
                return replaceO(oracion, n, ini+1,fin);
            }
        }
        else{
            return oracion;
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String pal = "#soyESPOL";
        String pal1 = "hola";
        String pal3 = "Buenos dias a TOdos!";
        System.out.println(firstMayus(pal));
        System.out.println(firstMayus(pal1));
        System.out.println(replaceOA(pal3, 2));
        System.out.println(replaceOA("academia",2));
    }
    
}
