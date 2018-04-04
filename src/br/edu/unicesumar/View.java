/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.ControlarVeiculo;
import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class View {
    ControlarVeiculo control;
    public View(){
        control = new ControlarVeiculo();
    }
    
    
    Scanner scan = new Scanner(System.in);
    
    public void exibir(){
        control.exibirTodos();
    }
    
    public void inserirCaminhao(){
        dadosVeiculo();
        System.out.println("Digite o peso suportado: ");
        int peso = scan.nextInt();
        System.out.println("Digite o tipo de carga: ");
        String tipo = scan.next();
        
        Caminhao c = new Caminhao(peso, tipo);
        
        control.inserirCaminhao(c);
    }
    
    public void dadosVeiculo(){
        System.out.println("Digite o Chassi: ");
        String chassi = scan.next();
        
        System.out.println("Digite o nome: ");
        String nome = scan.next();
        
        System.out.println("Digite a marca: ");
        String marca = scan.next();
        
        System.out.println("Digite o modelo: ");
        String modelo = scan.next();
        
        System.out.println("Digite o ano de fabricacao: ");
        int anoFab = scan.nextInt();
        
        System.out.println("Digite a placa: ");
        String placa = scan.next();
        
        System.out.println("Digite a cor: ");
        String cor = scan.next();
        Veiculo veiculo = new Veiculo(chassi, nome, marca, modelo, anoFab, placa, cor);
        //return(chassi, nome, marca, modelo, anoFab, placa, cor);
    }
}
