/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.app;

import br.edu.unicesumar.view.View;

/**
 *
 * @author est.faivanaga
 */
public class VeiculoApp {
    
    public static void main(String[] args){
        View view = new View();
        Tela tela = new Tela();
        int opcao = 0;
        
        while(opcao != 6){
            tela.menu();
            switch(tela.opcao()){
                case 0:
                    tela.listarOpcoes();
                    break;
                case 1:
                    view.listar();
                    break;
                case 2:
                    view.carregarAutomovel();
                    break;
                case 3:
                    view.carragarMotocicleta();
                    break;
                case 4:
                    view.carregarCaminhao();
                    break;
                case 5:
                    view.pesquisar();
                    break;
                case 6:
                    opcao = 6;
                    break;
                default:
                    System.out.println("\nOpção invalida");
                    break;
            }
        }
        
        System.out.println("Saindo...");
    }
}
