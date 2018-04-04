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
    private String tipo;
    
    public Caminhao(int peso, String tipo){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
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
