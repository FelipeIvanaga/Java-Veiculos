/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import java.util.ArrayList;
/**
 *
 * @author UniCesumar
 */
public class ControlarVeiculo {
    private ArrayList<Veiculo> lista;
    
    public ControlarVeiculo(){
        lista = new ArrayList<Veiculo>();
    }
    public void inserirCaminhao(Caminhao c){
        lista.add(c);
    }
    
    public void exibirTodos(){
        for(Veiculo c : lista){
            System.out.println("Chassi" + c.getChassi());
        }
    }
}
