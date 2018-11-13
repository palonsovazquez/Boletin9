/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_4;

/**
 *
 * @author palonsovazquez
 */
public class Boletin9_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer numero;
        do{
           numero = Peticiones.pedirNumIntFiltrado("un numero", Peticiones.CERO_POSITIVO);
           if(numero > 0) TablaMultiplicar.ejecutar(numero);
        
        
        }while(numero != 0);
    }
    
}
