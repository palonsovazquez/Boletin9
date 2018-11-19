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
public class Rectangulo {
    private Double base;
    private Double altura;
    private Double area;
    

    public Rectangulo(Double base, Double altura) {
        this.setBase(base);
        this.setAltura(altura);
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getArea() {
        return area;
    }

    

    public void setBase(Double base) {
        this.base = base;
        calcular();
        
    }

    public void setAltura(Double altura) {
        this.altura = altura;
        calcular();
    }
    
    private void calcular(){
    if(this.altura != null || this.base != null){
    this.area = this.base*this.altura ;
    
    
    }
    
    }
}
