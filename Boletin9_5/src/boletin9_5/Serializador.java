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

    public Serializador() {
    }

    public Serializador(Integer elementos) {
        this.setElementos(elementos);
    }

    public Integer getElementos() {
        return elementos;
    }

    public void setElementos(Integer elementos) {
        this.elementos = elementos;
    }

    public void serieSumas() {
        for (int i = 0; i < this.elementos; i = i + 2) {

        }

    }

}
