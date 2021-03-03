/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revcaneta4;

/**
 *
 * @author ti
 */
public class Caneta {
    
    private String modelo;
    private float ponta; 
    private String cor;
    private boolean tampada;
    
    //construtor
    public Caneta(){
        this.tampar();
        this.cor = "Azul";
    }
    
    //getter
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        this.ponta = p;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Sobre a Caneta: \nModelo: "+this.modelo+"\nPonta: " +this.ponta+"\nCor: "+this.cor+"\nTampada: "+this.tampada);
    }
}
