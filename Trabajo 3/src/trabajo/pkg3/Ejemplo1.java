/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo.pkg3;

/**
 *
 * @author Gabo
 */
public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Interfaz suma = new InterfazImpl();
        
        Interfaz resta = new Interfaz(){
            @Override
            public int operar(int a, int b) {
                return a-b;
            }
            
        };
        
        Interfaz multiplicacion = (int a, int b) -> {return a*b;};
        
        Interfaz division = (a,b) -> a/b;
        
        System.out.println("Suma = "+suma.operar(2, 2));
        System.out.println("Resta = "+resta.operar(2, 2));
        System.out.println("Multiplicacion = "+multiplicacion.operar(2, 2));
        System.out.println("Division = "+division.operar(2, 2));
    }
    
}
