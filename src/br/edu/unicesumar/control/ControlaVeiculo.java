/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.control;

import br.edu.unicesumar.model.Caminhao;
import br.edu.unicesumar.model.Motocicleta;
import br.edu.unicesumar.model.Veiculo;
import java.util.ArrayList;

/**
 *
 * @author est.faivanaga
 */
public class ControlaVeiculo {
    private ArrayList<Veiculo> lista;
    
    public ControlaVeiculo(){
        lista = new ArrayList<Veiculo>();
    }
    
    public void inserir(Veiculo v){
        lista.add(v);
    }
    
    public void listar(){
        for(Veiculo v : lista){
            if(v instanceof Motocicleta){
                System.out.println("----------Motocicleta----------");
                System.out.println("Chassi: " + v.getChassi());
                System.out.println("Cilindrada: " + ((Motocicleta) v).getCilindrada());
            }
            else if(v instanceof Caminhao){
                System.out.println("----------Caminhão----------");
                System.out.println("Chassi: " + v.getChassi());
                System.out.println("Peso suportado: " + ((Caminhao) v).getPeso());
                System.out.println("Tipo: " + ((Caminhao) v).getTipo());
            }
        }
    }
}
