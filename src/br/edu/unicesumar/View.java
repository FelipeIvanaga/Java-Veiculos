/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.ControlarVeiculo;
import java.util.Scanner;
import br.edu.unicesumar.Veiculo;

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
    
    public void forcarCa(){
        Veiculo v = new Caminhao("Chassi", "nome", "marca", "modelo", 123, "placa", "cor", 123, "tipo");
        control.inserirCaminhao(v);
    }
    public void inserirCaminhao(){
        
        Veiculo a = dadosVeiculo();
       
        
        
        System.out.println("Digite o peso suportado: ");
        int peso = scan.nextInt();
        System.out.println("Digite o tipo de carga: ");
        String tipo = scan.next();
        
        Veiculo v = new Caminhao(a.chassi, a.nome, a.marca, a.modelo, a.anoFab, a.placa, a.cor, peso, tipo);
        
        control.inserirCaminhao(v);
    }
    
    public void inserirMoto(){
        
        Veiculo a = dadosVeiculo();
        System.out.println("Digite a cilindrada: ");
        int cilindrada = scan.nextInt();
        System.out.println("Digite o tipo da moto: ");
        String tipoMoto = scan.next();
        
        Veiculo v = new Motocicleta(a.chassi, a.nome, a.marca, a.modelo, a.anoFab, a.placa, a.cor, cilindrada, tipoMoto);
        
        control.inserirMoto(v);
    }
    
    public void inserirAutomovel(){
        Veiculo a = dadosVeiculo();
        System.out.println("Quantidade de portas: ");
        int portas = scan.nextInt();
        System.out.println("Capacidade de passageiros: ");
        int quantPas = scan.nextInt();
        
        Veiculo v = new Automovel(a.chassi, a.nome, a.marca, a.modelo, a.anoFab, a.placa, a.cor, portas, quantPas);
        
        control.inserirAutomovel(v);
    }
    
    public Veiculo dadosVeiculo(){
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
        Veiculo a = new Veiculo(chassi, nome, marca, modelo, anoFab, placa, cor);
        return(a);
    }
}
