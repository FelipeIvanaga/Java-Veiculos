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
public class Automovel extends Veiculo {
    private int portas;
    private int quantPas;
    
    public Automovel(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor, int portas, int quantPas){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.portas = portas;
        this.quantPas = quantPas;
    }
    
    public int getPortas(){
        return portas;
    }
    
    public void setPortas(int portas){
        this.portas = portas;
    }
    
    public int getQunatPas(){
        return quantPas;
    }
    
    public void setQuantPas(int quantPas){
        this.quantPas = quantPas;
    }
}
