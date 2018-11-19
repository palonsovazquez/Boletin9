/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

/**
 *
 * @author palonsovazquez
 */
public class Boletin9_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El area del triangulo es "+ new Rectangulo(Peticiones.pedirNumDoubleFiltrado("la base", Peticiones.CERO_POSITIVO),Peticiones.pedirNumDoubleFiltrado("la altura", Peticiones.CERO_POSITIVO)).getArea() );
    }
    
}
