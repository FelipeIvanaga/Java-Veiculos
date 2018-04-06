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
    /*public void inserirCaminhao(Veiculo v){
        lista.add(v);
    }
    
    public void inserirMoto(Veiculo v){
        lista.add(v);
    }*/
    
    public void inserir(Veiculo v){
        System.out.println("Chassi: " + v.getChassi());
        lista.add(v);
    }
    
    public void exibirTodos(Caminhao a){
        
        if(lista != null & lista.size() > 0){
            for(Caminhao v: lista){
                //Veiculo a = lista.get(i);
                System.out.println("Chassi" + v.getChassi() + v.ge);
            }
        }else{
            System.out.println("Ta VAZIO");
        }
    }
    
    
}
