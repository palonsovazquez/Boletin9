/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

/**
 *
 * @author palonsovazquez
 */
public class CuentaNegativos {

    public CuentaNegativos() {
    }

    public void ejecutar() {
        Double aux;
        Integer positivos = 0, negativos = 0, nulos = 0;
        for (int i = 0; i < 10; i++) {
            aux = Peticiones.pedirNumeroDouble(" un numero");
            if (aux > 0) {
                positivos++;
            } else {
                if (aux < 0) {
                    negativos++;
                } else {
                    nulos++;
                }
            }

        }
        System.out.println("hay "+ positivos + " positivos "+ negativos + " negativos " + nulos + " ceros " );

    }

}
