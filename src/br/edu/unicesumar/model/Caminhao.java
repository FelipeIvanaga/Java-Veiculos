/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.model;

/**
 *
 * @author est.faivanaga
 */
public class Caminhao extends Veiculo{
    private int peso;
    private String tipo;
    
    public Caminhao(String chassi, String placa, String modelo, int peso, String tipo){
        super(chassi,placa,modelo);
        this.peso = peso;
        this.tipo = tipo;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}
