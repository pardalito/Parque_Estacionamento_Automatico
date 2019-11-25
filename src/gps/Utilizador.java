/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.ArrayList;
import java.util.Calendar;
final class Data{
    private int mes, ano;
    
    public Data(int mes, int ano){
        if(setMes(mes) == false){
            System.out.println("Mes errado...");
            System.exit(1);
        }
        if(setAno(ano) == false){
            System.out.println("Ano errado...");
            System.exit(2);
        }
    }
    
    public int getMes(){
        return mes;
    }
    
    public int getAno(){
        return ano;
    }
    
    public boolean setMes(int mes){
        Calendar cal = Calendar.getInstance();
        if(mes < 1 || mes > 12)
            return false;
        if(cal.get(Calendar.YEAR) == ano){
            if(cal.get(Calendar.MONTH) < mes)
                return false;
        }
        this.mes = mes;
        return true;
    }
    
    public boolean setAno(int ano){
        Calendar cal = Calendar.getInstance();
        if(cal.get(Calendar.YEAR) > ano)
            return false;
        this.ano = ano;
        return true;
    }
}

public class Utilizador {
    
    private static int n=0;
    private final int id;
    private int num_cartao, csv, perg_segur;
    private Data validade;
    private String nome_completo, email, password, resposta_seguranca;
    ArrayList<Carro> carros;

    
    
    public Utilizador(String nome_completo, String email, String password, int num_cartao, int csv, Data validade, int perg_seg, String resposta) {
        id=++n;
        this.nome_completo=nome_completo;
        this.email=email;
        this.password=password;
        this.num_cartao=num_cartao;
        this.csv=csv;
        this.validade=validade;
        perg_segur=perg_seg;
        resposta_seguranca=resposta;
    }

    
    
    public int getId() {
        return id;
    }

    
    public int getNum_cartao() {
        return num_cartao;
    }

    
    public int getCsv() {
        return csv;
    }

    
    public void setCsv(int csv) {
        this.csv = csv;
    }

    
    public int getPerg_segur() {
        return perg_segur;
    }

    
    public final Data getValidade() {
        return validade;
    }

    
    public void setValidade(Data validade) {
        this.validade = validade;
    }

    
    public final String getNome_completo() {
        return nome_completo;
    }

    
    public final String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }

    
    public final String getPassword() {
        return password;
    }

    
    public void setPassword(String password) {
        this.password = password;
    }

    
    public final String getResposta_seguranca() {
        return resposta_seguranca;
    }
    
    
}