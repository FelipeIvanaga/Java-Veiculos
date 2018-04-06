/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.TelaVeiculo;

/**
 *
 * @author UniCesumar
 */
public class VeiculoApp {

    public static void main(String[] args){
        TelaVeiculo tela = new TelaVeiculo();
        boolean continuar = true;
        while (continuar == true){
            View view = new View();
            switch(tela.menu()){
                case 0:
                    System.out.println("\n----------Opcoes----------");
                    System.out.println("1 - Listar todos");
                    System.out.println("2 - Inserir motocicleta");
                    System.out.println("3 - Inserir caminhao");
                    System.out.println("4 - Inserir automovel");
                    System.out.println("5 - Pesquisar por placa");
                    break;
                case 1:
                    view.exibir();
                    break;
                case 2:
                    view.inserirMoto();
                    break;
                case 3:
                    view.inserirCaminhao();
                    break;
                case 4:
                    view.inserirAutomovel();
                    break;
                case 5:
                    view.forcarCa();
                    view.exibir();
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }
    }
}
