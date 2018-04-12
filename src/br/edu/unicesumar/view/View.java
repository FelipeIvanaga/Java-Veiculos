/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar.view;

import br.edu.unicesumar.control.ControlaVeiculo;
import br.edu.unicesumar.model.Caminhao;
import br.edu.unicesumar.model.Motocicleta;
import br.edu.unicesumar.model.Veiculo;
import br.edu.unicesumar.model.Automovel;
import java.util.Scanner;

/**
 *
 * @author est.faivanaga
 */
public class View {
    private ControlaVeiculo control;
    private Scanner scan = new Scanner(System.in);
    
    public View(){
        control = new ControlaVeiculo();
    }
    
    public void carregarAutomovel(){
        System.out.println("----------Automovel----------");
        Veiculo aux = dadosVeiculo();
        
        System.out.print("Portas: ");
        int portas = scan.nextInt();
        System.out.print("Cavalos: ");
        int cavalos = scan.nextInt();

        Veiculo v = new Automovel(aux.getChassi(),aux.getPlaca(),aux.getModelo(),portas,cavalos);
        control.inserir(v);
    }
    
    public void carragarMotocicleta(){
        System.out.println("----------Motocicleta----------");
        Veiculo aux = dadosVeiculo();
        System.out.print("Cilindrada: ");
        int cilindrada = scan.nextInt();

        Veiculo v = new Motocicleta(aux.getChassi(),aux.getPlaca(),aux.getModelo(),cilindrada);
        control.inserir(v);
    }
    
    public void carregarCaminhao(){
        System.out.println("----------Caminhão----------");
        Veiculo aux = dadosVeiculo();
        System.out.print("Peso suportado: ");
        int peso = scan.nextInt();
        System.out.print("Tipo: ");
        String tipo = scan.next();
        
        Veiculo v = new Caminhao(aux.getChassi(),aux.getPlaca(),aux.getModelo(),peso,tipo);
        control.inserir(v);
    }
    
    public Veiculo dadosVeiculo(){
        System.out.print("Chassi: ");
        String chassi = scan.next();
        System.out.print("Placa: ");
        String placa = scan.next();
        System.out.print("Modelo: ");
        String modelo = scan.next();
        Veiculo aux = new Veiculo(chassi,placa,modelo);
        return(aux);
    }
    
    public void listar(){
        control.listar();
    }
    
    public void pesquisar(){
        String placa = scan.next();
        control.pesquisar(placa);
    }
}
