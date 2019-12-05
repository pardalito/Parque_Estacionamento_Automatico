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
    private int id;
    private String csv;
    private String num_cartao;
    private Data validade;
    private String nome_completo;
    private String email;
    private String password;
    private ArrayList<Carro> carros;

    
    
    public Utilizador(String nome_completo, String email, String password, String num_cartao, String csv, Data validade, int perg_seg, String resposta) {
//        id=++n;
//        if(setNomeCompleto(nome_completo) == false){
//            System.out.println("Introduza apenas letras e espaços (10-80 caracteres)");
//            System.exit(0);
//        }
//        if(setEmail(email) == false){
//            System.out.println("Email inválido");
//            System.exit(1);
//        }
//        if(setPassword(password) == false){
//            System.out.println("Introduza apenas letras e espaços (8-25 caracteres)");
//            System.exit(2);
//        }
//        if(setNumCartao(num_cartao) == false){
//            System.out.println("Número de Cartão de crédito inválido");
//            System.exit(3);
//        }
//        if(setCsv(csv) == false){
//            System.out.println("CSV incorreto");
//            System.exit(4);
//        }
//        if(setValidade(validade) == false){
//            System.out.println("Validade incorreta");
//            System.exit(5);
//        }
//        perg_segur=perg_seg;
//        if(setResposta_seguranca(resposta) == false){
//            System.out.println("Introduza apenas espaços, letras e números (8-25 caracteres)");
//            System.exit(6);
//        }
    }
    
    public Utilizador(){
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the csv
     */
    public String getCsv() {
        return csv;
    }

    /**
     * @param csv the csv to set
     */
    public void setCsv(String csv) {
        this.csv = csv;
    }
    
    

    /**
     * @return the num_cartao
     */
    public String getNum_cartao() {
        return num_cartao;
    }

    /**
     * @param num_cartao the num_cartao to set
     */
    public void setNumCartao(String numC) {
        num_cartao = numC;
    }
    
    

    /**
     * @return the validade
     */
    public Data getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public boolean setValidade(Data validade) {
        if(validade.setAno(validade.getAno()) == false || validade.setMes(validade.getMes()) == false)
            return false;
        this.validade = validade;
        return true;
    }

    /**
     * @return the nome_completo
     */
    public String getNome_completo() {
        return nome_completo;
    }

    /**
     * @param nome_completo the nome_completo to set
     */
    public void setNomeCompleto(String nome){
        this.nome_completo = nome;
    }
    
    

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    


    /**
     * @return the carros
     */
    public ArrayList<Carro> getCarros() {
        return carros;
    }

    /**
     * @param carros the carros to set
     */
    public void setCarros(ArrayList<Carro> carros) {
        this.carros = carros;
    }
    
    /*
    *
    * Verificaçoes
    *
    */
    
        public static boolean CheckPassword(String password) { 
        if(password.length() < 8 || password.length() > 25)
            return false;
        
        char[] a = password.toCharArray();

        for (char c : a) {
            if(!(((c >= 'a') && (c <= 'z'))
                    || ((c >= 'A') && (c <= 'Z'))
                    || ((c >= '0') && (c <= '9')
                    || (c == ' '))))
                            return false;
        }
        return true;
    }
        
         public static boolean CheckEmail(String email) {
           String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
           java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
           java.util.regex.Matcher m = p.matcher(email);
           return m.matches();
    }
         
         
        public static boolean Checknome(String nome){
        if(nome.length() < 10 || nome.length() > 80)
            return false;
        char[] a = nome.toCharArray();

        for (char c : a) {
            if(!(((c >= 'a') && (c <= 'z'))
                    || ((c >= 'A') && (c <= 'Z'))
                    || (c == ' ')))
                            return false;
        }
        return true;
    }
         
        public static boolean ChecknCartao(String ncartao){
        return (ncartao.matches("[0-9]+") && ncartao.length() == 16);
    }
        
        public static boolean CheckCSV(String csv) {
    return (csv.matches("[0-9]+") && csv.length() == 3);
    }

    
}