/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;
import br.edu.unicesumar.Veiculo;
/**
 *
 * @author UniCesumar
 */
public class Motocicleta extends Veiculo{
    private int cilindrada;
    private String tipoMoto;
    
    public Motocicleta(int cilindrada,String tipoMoto){
        super(chassi, nome, marca, modelo, anoFab, placa, cor);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }
}
