/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.model;

/**
 *
 * @author UniCesumar
 */
public class Automovel extends Veiculo {
    private int portas;
    private int cavalos;
    
    public Automovel(String chassi, String placa, String modelo, int portas, int cavalos){
        super(chassi,placa,modelo);
        this.portas = portas;
        this.cavalos = cavalos;
    }
    
    public int getPortas(){
        return portas;
    }
    
    public void setPortas(int portas){
        this.portas = portas;
    }
    
    public int getCavalos(){
        return cavalos;
    }
    
    public void setCavalos(int cavalos){
        this.cavalos = cavalos;
    }
}
