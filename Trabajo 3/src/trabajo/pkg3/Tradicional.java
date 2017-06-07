/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Gabo
 */
public class Tradicional {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        //Encontrar los numeros pares y guardarlos en un arrayList
        
        List<Integer> resultados = new ArrayList<Integer>();
        
        //Programacion Tradicional:
        for(int i = 0; i< numeros.size(); i++) {
            if(numeros.get(i)%2 == 0){
                resultados.add(numeros.get(i));
            }
        }
        
        System.out.println(resultados);

    }
    
}
