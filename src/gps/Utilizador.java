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
    private int perg_segur;
    private String csv;
    private String num_cartao;
    private Data validade;
    private String nome_completo;
    private String email;
    private String password;
    private String resposta_seguranca;
    ArrayList<Carro> carros;

    
    
    public Utilizador(String nome_completo, String email, String password, String num_cartao, String csv, Data validade, int perg_seg, String resposta) {
        id=++n;
        if(setNomeCompleto(nome_completo) == false){
            System.out.println("Introduza apenas letras e espaços (10-80 caracteres)");
            System.exit(0);
        }
        if(setEmail(email) == false){
            System.out.println("Email inválido");
            System.exit(1);
        }
        if(setPassword(password) == false){
            System.out.println("Introduza apenas letras e espaços (8-25 caracteres)");
            System.exit(2);
        }
        if(setNumCartao(num_cartao) == false){
            System.out.println("Número de Cartão de crédito inválido");
            System.exit(3);
        }
        if(setCsv(csv) == false){
            System.out.println("CSV incorreto");
            System.exit(4);
        }
        if(setValidade(validade) == false){
            System.out.println("Validade incorreta");
            System.exit(5);
        }
        perg_segur=perg_seg;
        if(setResposta_seguranca(resposta) == false){
            System.out.println("Introduza apenas espaços, letras e números (8-25 caracteres)");
            System.exit(6);
        }
    }
    
    public int getId() {
        return id;
    }

    
    public String getNum_cartao() {
        return num_cartao;
    }

    
    public String getCsv() {
        return csv;
    }
    
    public boolean setNumCartao(String numC){
        if(numC.length() != 16){
            return false;
        }
        num_cartao = numC;
        return true;
    }
    
    public boolean setCsv(String csv) {
        if(csv.length() != 3)
            return false;
        this.csv = csv;
        return true;
    }
    
    public boolean setNomeCompleto(String nome){
        if(nome.length() < 10 || nome.length() > 80)
            return false;
        this.nome_completo = nome;
        return true;
    }
    
    public int getPerg_segur() {
        return perg_segur;
    }

    
    public final Data getValidade() {
        return validade;
    }

    
    public boolean setValidade(Data validade) {
        if(validade.setAno(validade.getAno()) == false || validade.setMes(validade.getMes()) == false)
            return false;
        this.validade = validade;
        return true;
    }

    
    public final String getNome_completo() {
        return nome_completo;
    }

    
    public final String getEmail() {
        return email;
    }

    
    public boolean setEmail(String email) {
        if(email.contains("@") && email.contains(".com")){
            this.email = email;
            return true;
        }
        this.email = email;
        return false;
    }

    
    public final String getPassword() {
        return password;
    }

    
    public boolean setPassword(String password) {
        if(password.length() < 8 || password.length() > 25)
            return false;
        this.password = password;
        return true;
    }

    
    public final String getResposta_seguranca() {
        return resposta_seguranca;
    }
    
    public boolean setResposta_seguranca(String resposta){
        if(resposta.length() < 8 || resposta.length() > 25)
            return false;
        this.resposta_seguranca = resposta;
        return false;
    }
    
}