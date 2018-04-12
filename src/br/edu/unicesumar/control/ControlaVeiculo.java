/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.control;

import br.edu.unicesumar.model.Automovel;
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
        if (lista != null & lista.size() > 0){
            for(Veiculo v : lista){
                System.out.println("");
                if(v instanceof Automovel){
                    System.out.println("----------Automovel----------");
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Portas: " + ((Automovel) v).getPortas());
                    System.out.println("Cavalos: " + ((Automovel) v).getCavalos());
                }
                else if(v instanceof Motocicleta){
                    System.out.println("----------Motocicleta----------");
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Cilindrada: " + ((Motocicleta) v).getCilindrada());
                }
                else if(v instanceof Caminhao){
                    System.out.println("----------Caminhão----------");
                    System.out.println("Chassi: " + v.getChassi());
                    System.out.println("Placa: " + v.getPlaca());
                    System.out.println("Modelo: " + v.getModelo());
                    System.out.println("Peso suportado: " + ((Caminhao) v).getPeso());
                    System.out.println("Tipo: " + ((Caminhao) v).getTipo());
                }
            }
        } else {
            System.out.println("\n----------Lista Vazia----------\n");
        }
    }
    
    public void pesquisar(String placa){
        if(lista != null & lista.size() > 0){
            for(Veiculo v : lista){
                if(v.getPlaca().equals(placa)){
                    if(v instanceof Automovel){
                        System.out.println("----------Automovel----------");
                        System.out.println("Chassi: " + v.getChassi());
                        System.out.println("Placa: " + v.getPlaca());
                        System.out.println("Modelo: " + v.getModelo());
                        System.out.println("Portas: " + ((Automovel) v).getPortas());
                        System.out.println("Cavalos: " + ((Automovel) v).getCavalos());
                    }
                    else if(v instanceof Motocicleta){
                        System.out.println("----------Motocicleta----------");
                        System.out.println("Chassi: " + v.getChassi());
                        System.out.println("Placa: " + v.getPlaca());
                        System.out.println("Modelo: " + v.getModelo());
                        System.out.println("Cilindrada: " + ((Motocicleta) v).getCilindrada());
                    }
                    else if(v instanceof Caminhao){
                        System.out.println("----------Caminhão----------");
                        System.out.println("Chassi: " + v.getChassi());
                        System.out.println("Placa: " + v.getPlaca());
                        System.out.println("Modelo: " + v.getModelo());
                        System.out.println("Peso suportado: " + ((Caminhao) v).getPeso());
                        System.out.println("Tipo: " + ((Caminhao) v).getTipo());
                    }
                }
            }
        } else {
            System.out.println("\n----------Lista Vazia----------\n");
        }
    }
}
