/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.Veiculo;
/**
 *
 * @author UniCesumar
 */
public class Caminhao extends Veiculo{
    private int peso;
    private String tipoCarga;
    
    public Caminhao(int peso, String tipoCarga){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public String getTipoCarga(){
        return tipoCarga;
    }
    
    public void setTipoCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }
}
