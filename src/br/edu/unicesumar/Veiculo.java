/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unicesumar;

/**
 *
 * @author UniCesumar
 */
public class Veiculo {
    protected static String chassi;
    protected static String nome;
    protected static String marca;
    protected static String modelo;
    protected static int anoFab;
    protected static String placa;
    protected static String cor;
    
    public Veiculo(String chassi, String nome, String marca, String modelo, int anoFab, String placa, String cor){
        super();
        this.chassi = chassi;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFab = anoFab;
        this.placa = placa;
        this.cor = cor;
    }
    
    public String getChassi(){
        return chassi;
    }
    
    public void setChassi(String chassi){
        this.chassi = chassi;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the anoFab
     */
    public int getAnoFab() {
        return anoFab;
    }

    /**
     * @param anoFab the anoFab to set
     */
    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}
