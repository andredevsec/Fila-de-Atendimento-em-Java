/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaqueue;

/**
 *
 * @author 11002167663
 */
public class Pessoa {
    
    private String nome;
    private String rg;
    private int idade;

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return getNome() + ":" + getIdade();
                }// fim toString
    
}
