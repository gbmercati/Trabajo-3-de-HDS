/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

/**
 *
 * @author Gabo
 */
public class Funcional {
    
    //------------------------   SIN LAMBDA   ---------------------------------------------
    
   /* static boolean esPar(Integer n){
        return n%2 == 0;
    }
    
     public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Encontrar los numeros pares y guardarlos en un arrayList
        
        List<Integer> resultados = new ArrayList<Integer>();
        
        //Metodo Funcional:
        resultados = numeros.stream().filter(Funcional :: esPar).collect(Collectors.toList());
        
        System.out.println(resultados);

    }
*/
    //------------------------   CON LAMBDA   ---------------------------------------------
    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Encontrar los numeros pares y guardarlos en un arrayList
        
        List<Integer> resultados = new ArrayList<Integer>();
        
        //Metodo Funcional:
        resultados = numeros.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        
        System.out.println(resultados);

    }
}
