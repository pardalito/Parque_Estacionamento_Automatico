/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

/**
 *
 * @author ze1
 */
public class Lugar {
    String Nome;
    boolean Livre;
    int Qualidade;


    
    
    Lugar(String nome, String livre, String qualidade){
        this.Nome = nome;
        this.Livre = livre.compareTo("l")==0;
        this.Qualidade = Integer.parseInt(qualidade);    
    }
    
    public int getQualidade(){
        return Qualidade;
    }
    public String getNome(){
        return Nome;
    }
    public boolean isLivre(){
        return Livre;
    }
}
