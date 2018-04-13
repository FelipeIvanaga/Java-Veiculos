package br.edu.unicesumar.app;

import java.util.Scanner;

/**
 * Autor: Felipe Alves Ivanaga
 * github.com/felipeivanaga
 */
public class Tela {
    public void menu(){
        System.out.println("----------Menu----------");
    }
    
    //Leitura de opção
    public int opcao(){
        Scanner scan = new Scanner(System.in);
        System.out.println("0 - Opções");
        return (scan.nextInt());
    }
    
    public void listarOpcoes(){
        System.out.println("----------Opções----------");
        System.out.println("1 - Exibir veiculos");
        System.out.println("2 - Inserir Automovel");
        System.out.println("3 - Inserir Caminhão");
        System.out.println("4 - Inserir Motocicleta");
        System.out.println("5 - Pesquisar");
        System.out.println("6 - Sair");
    }
}
