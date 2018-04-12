/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.app;

import java.util.Scanner;

/**
 *
 * @author est.faivanaga
 */
public class Tela {
    public void menu(){
        System.out.println("----------Menu----------");
    }
    
    public int opcao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Opções");
        return (scan.nextInt());
    }
    
    public void listarOpcoes(){
        System.out.println("----------Opções----------");
        System.out.println("1 - Exibir veiculos");
        System.out.println("2 - Inserir Automovel");
        System.out.println("3 - Inserir Motocicleta");
        System.out.println("4 - Inserir Caminhão");
        System.out.println("5 - Pesquisar");
        System.out.println("6 - Sair");
    }
}
