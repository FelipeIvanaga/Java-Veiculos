/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;

import java.util.Scanner;

/**
 *
 * @author UniCesumar
 */
public class TelaVeiculo {
    
    Scanner scan = new Scanner(System.in);
    public int menu(){
        System.out.println("\n----------Menu----------");
        System.out.println("0 - opcoes");
        int opcao = scan.nextInt();
        return opcao;
    }

}
