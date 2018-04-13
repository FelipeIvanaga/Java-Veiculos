
package br.edu.unicesumar.app;

import br.edu.unicesumar.view.View;

/**
 * Autor: Felipe Alves Ivanaga
 * github.com/felipeivanaga
 */
public class VeiculoApp {
    
    public static void main(String[] args){
        View view = new View();
        Tela tela = new Tela();
        
        //Variavel de controle do loop
        boolean sair = false;
        
        //Loop para execusão do programa até o usuario desejar sair
        while(sair != true){
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
                    view.carregarCaminhao();
                    break;
                case 4:
                    view.carragarMotocicleta();
                    break;
                case 5:
                    view.pesquisar();
                    break;
                case 6:
                    //Muda variavel de controle para saida do loop
                    sair = true;
                    break;
                default:
                    System.out.println("\nOpção invalida");
                    break;
            }
        }
        System.out.println("Saindo...");
    }
}
