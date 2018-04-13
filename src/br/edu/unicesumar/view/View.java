package br.edu.unicesumar.view;

import br.edu.unicesumar.control.ControlaVeiculo;
import br.edu.unicesumar.model.Caminhao;
import br.edu.unicesumar.model.Motocicleta;
import br.edu.unicesumar.model.Veiculo;
import br.edu.unicesumar.model.Automovel;
import java.util.Scanner;

/**
 * Autor: Felipe Alves Ivanaga github.com/felipeivanaga
 */
public class View {

    private ControlaVeiculo control;
    private Scanner scan = new Scanner(System.in);

    public View() {
        control = new ControlaVeiculo();
    }

    public void carregarAutomovel() {
        System.out.println("----------Automovel----------");

        //Leitura de dados que pertencem a classe veiculo
        Veiculo aux = dadosVeiculo();

        System.out.print("Portas: ");
        int portas = scan.nextInt();
        System.out.print("Cavalos: ");
        int cavalos = scan.nextInt();

        Veiculo v = new Automovel(aux.getChassi(), aux.getPlaca(), aux.getModelo(), aux.getAno(), portas, cavalos);
        control.inserir(v);
    }

    public void carragarMotocicleta() {
        System.out.println("----------Motocicleta----------");

        //Leitura de dados que pertencem a classe veiculo
        Veiculo aux = dadosVeiculo();

        System.out.print("Cilindrada: ");
        int cilindrada = scan.nextInt();

        Veiculo v = new Motocicleta(aux.getChassi(), aux.getPlaca(), aux.getModelo(), aux.getAno(), cilindrada);
        control.inserir(v);
    }

    public void carregarCaminhao() {
        System.out.println("----------Caminhão----------");

        //Leitura de dados que pertencem a classe veiculo
        Veiculo aux = dadosVeiculo();

        System.out.print("Peso suportado: ");
        int peso = scan.nextInt();
        System.out.print("Tipo: ");
        String tipo = scan.next();

        Veiculo v = new Caminhao(aux.getChassi(), aux.getPlaca(), aux.getModelo(), aux.getAno(), peso, tipo);
        control.inserir(v);
    }

    //Leitura de dados que pertencem a classe veiculo
    public Veiculo dadosVeiculo() {
        System.out.print("Chassi: ");
        String chassi = scan.next();
        System.out.print("Placa: ");
        String placa = scan.next();
        System.out.print("Modelo: ");
        String modelo = scan.next();
        System.out.print("Ano: ");
        int ano = scan.nextInt();

        Veiculo aux = new Veiculo(chassi, placa, modelo, ano);
        return (aux);
    }

    public void listar() {
        control.listar();
    }

    public void pesquisar() {
        System.out.println("----------Pesquisa----------");
        System.out.print("Placa: ");
        String placa = scan.next();
        control.pesquisar(placa);
    }
}
