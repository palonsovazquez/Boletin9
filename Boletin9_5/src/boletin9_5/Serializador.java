/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_5;

/**
 *
 * @author palonsovazquez
 */
public class Serializador {

    private Integer elementos = 0;


    public Serializador(Integer elementos) {
        this.setElementos(elementos);
    }

    public Integer getElementos() {
        return elementos;
    }

    public void setElementos(Integer elementos) {
        this.elementos = elementos;
    }

    public void seriePares() {
        int contador = 0;
        for (int i = 0; i < this.elementos; i++) {
            if (i == this.elementos - 1) {
                System.out.println(contador + ".\n");
            } else {
                System.out.print(contador + ",");
                contador = contador + 2;
            }
        }
    }

    public void serieAlternarNeg() {
        Integer contador = 0;
        String str = "";
        for (int i = 0; i < this.elementos; i++) {
            if (contador % 2 == 0) {
                str = contador.toString();
            } else {
                str = "-"+ contador.toString();
            }
            if (i == this.elementos - 1) {
                str = str + ".";
            } else {
                str = str + ",";
                contador++;
            }
            System.out.print(str);
            str = "";
        }
    }
    
  public void fibonacci()
  {
      Integer numAnterior = 0,numActual =1,aux;
      Integer Acumulador = 0;
      System.out.println(numAnterior+","+numActual);
      
      for(Integer i = 2; i < this.elementos;i++)
      {
          aux = numActual;
          numActual = numActual+ numAnterior;
          numAnterior = aux;
      if (i == this.elementos - 1) {
                 System.out.print(numActual + ".\n");
            } else {
                System.out.print(numActual + ",");
                
            }
      
      
      }
  
  }

}
