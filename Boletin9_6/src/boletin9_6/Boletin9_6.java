/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_6;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin9_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salida = false;
        float sueldo;
        int infraSueldo = 0, buenSueldo = 0, trabajadores = 0;
        do {
            sueldo = Peticiones.pedirNumIntFiltrado("el sueldo", Peticiones.CERO_POSITIVO);
            if (sueldo == 0) {
                salida = true;
            } else {
                if (sueldo < 1000) {
                    infraSueldo++;
                    trabajadores++;
                } else {
                    if (sueldo <= 1750) {
                        buenSueldo++;
                        trabajadores++;
                    }else{trabajadores++;}

                }

            }

        } while (salida == false);
        if (trabajadores > 0) {
            System.out.println("Trabajadores con el sueldo entre 1000€ y 1750€ = " + buenSueldo + " personas");
            System.out.println("Trabajadores con sueldo menor a 1000€ " + ((float)infraSueldo / (float)trabajadores)*100f + "%");
        }
    }

}
