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
public class Veiculo {
    protected String chassi;
    protected String placa;
    protected String modelo;
    
    public Veiculo(String chassi, String placa, String modelo){
        super();
        this.chassi = chassi;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    public String getChassi(){
        return chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

}
