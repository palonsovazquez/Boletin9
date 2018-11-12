/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author palonsovazquez
 */
public class Operaciones {

    public Operaciones() {
    }
    
    
    public static void ejecutar(){
   Double nInicio = 10d, nFinal = 90d, acumulaSuma = 0d, acumulaMult = 1d;
    
    for(double i = nInicio; i <= nFinal;i++ ){
        acumulaSuma += i;
        acumulaMult *= i;
        
    
    }
        System.out.println("la suma es: "+ acumulaSuma + " y la multiplicacion es: "+ acumulaMult);
    
    }
}
