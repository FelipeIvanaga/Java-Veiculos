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
public class Motocicleta extends Veiculo {
    private int cilindrada;
    
    public Motocicleta(String chassi, String placa, String modelo, int cilindrada){
        super(chassi,placa,modelo);
        this.cilindrada = cilindrada;
    }
    
    public int getCilindrada(){
        return cilindrada;
    }
    
    public void setCilindrada(int cilindrada){
        this.cilindrada = cilindrada;
    }
}
