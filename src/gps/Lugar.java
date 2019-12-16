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
    String Livre;
    int Qualidade;


    
    
    Lugar(String nome, String livre, int qualidade){
        if(nome == null || livre == null){
            this.Nome = "default";
            this.Livre = "default";
            this.Qualidade = 0;
        }else{
        this.Nome = nome;
        if(livre.compareTo("l")==0)
        this.Livre = "livre";
        else
            this.Livre = "ocupado";
        this.Qualidade = qualidade;    
        }
        }
    
    public int getQualidade(){
        return Qualidade;
    }
    public String getNome(){
        return Nome;
    }
    public String isLivre(){
        return Livre;
    }
}
