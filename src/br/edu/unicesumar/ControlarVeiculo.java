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
    public void inserirCaminhao(Veiculo v){
        lista.add(v);
    }
    
    public void inserirMoto(Veiculo v){
        lista.add(v);
    }
    
    public void inserirAutomovel(Veiculo v){
        lista.add(v);
    }
    
    public void exibirTodos(){
        
        if(lista != null & lista.size() > 0){
            for(int i = 0; i < lista.size(); i++){
                Veiculo a = lista.get(i);
                System.out.println("Chassi" + a.getChassi());
            }
        }
        else{
            System.out.println("Ta VAZIO");
        }
    }
    
    
}
