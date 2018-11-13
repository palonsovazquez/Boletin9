/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author palonsovazquez
 */
public class Operaciones {

    public Operaciones() {
    }
    
    
    /*public static void ejecutar(){
    Double nInicio = 10d, nFinal = 90d, acumulaSuma = 0d, acumulaMult = 1d;
    
    for(double i = nInicio; i <= nFinal;i++ ){
    acumulaSuma += i;
    acumulaMult *= i;
    
    
    }
    
    System.out.printf("la suma es: %f y la multiplicacion es %.2f: ",acumulaSuma , acumulaMult);
    
    }*/
    
    
    public static void ejecutar(){
        Integer nInicio = 10, nFinal = 90;
        BigInteger acumulaSuma = BigInteger.valueOf(0);
        BigInteger acumulaMult = BigInteger.valueOf(1);
    
    for(Integer i = nInicio; i <= nFinal;i++ ){
    acumulaSuma = acumulaSuma.add(BigInteger.valueOf(i));
    acumulaMult = acumulaMult.multiply(BigInteger.valueOf(i));
    
    
        
    }
    BigDecimal acumulaMult2 = new  BigDecimal( acumulaMult);
    Integer exponente = acumulaMult.toString().length() -1;
    acumulaMult2 = acumulaMult2.divide(BigDecimal.valueOf(Math.pow(10, exponente)));
    String multiplicacionFormateada = acumulaMult2.toPlainString().substring(0, 5) +" 10 \u00B9 " + exponente;
    
        
        System.out.println("la suma es " +acumulaSuma+ " y la multiplicacion "+ acumulaMult2.toPlainString().substring(0, 5) +" *10"+ Peticiones.DevolverSuperIndice(exponente));
    
    
    }
    
    
}
