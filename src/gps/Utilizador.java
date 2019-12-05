/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gps;

import java.util.ArrayList;
import java.util.Calendar;

final class Data {

    static final int mesI=1, mesF = 12;
    
    private int mes, ano;

    public Data(int mes, int ano) {
        this.mes = mes;
        this.ano = ano;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    private void setMes(int mes, int ano) {
        this.mes = mes;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }
}

public class Utilizador {
    static final int passMin = 8, passMax = 25, nomeMin = 10, nomeMax = 80;
    private String csv;
    private String num_cartao;
    private Data validade;
    private String nome_completo;
    private String email;
    private String password;
    private ArrayList<Carro> carros;

    public Utilizador(String nome_completo, String email, String password, String num_cartao, String csv, Data validade) {
        this.nome_completo = nome_completo;
        this.email = email;
        this.password = password;
        this.num_cartao = num_cartao;
        this.csv = csv;
        this.validade = validade;
    }

        /**
     * @return the csv
     */
    public String getCsv() {
        return csv;
    }
    
    /**
     * @return the carros
     */
    public ArrayList<Carro> getCarros() {
        return carros;
    }
    
     /**
     * @return the num_cartao
     */
    public String getNum_cartao() {
        return num_cartao;
    }
    
    /**
     * @return the validade
     */
    public Data getValidade() {
        return validade;
    }    
 
    /**
     * @return the nome_completo
     */
    public String getNome_completo() {
        return nome_completo;
    }  

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
 
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * @param csv the csv to set
     */
    public void setCsv(String csv) {
        this.csv = csv;
    }

    /**
     * @param num_cartao the num_cartao to set
     */
    public void setNumCartao(String numC) {
        num_cartao = numC;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(Data validade) {
        this.validade = validade;
    }


    /**
     * @param nome
     * @param nome_completo the nome_completo to set
     */
    public void setNomeCompleto(String nome) {
        this.nome_completo = nome;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
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
        if (password == null) {
            return false;
        }
        if (password.length() < passMin || password.length() > passMax) {
            return false;
        }

        char[] a = password.toCharArray();

        for (char c : a) {
            if (!(((c >= 'a') && (c <= 'z'))
                    || ((c >= 'A') && (c <= 'Z'))
                    || ((c >= '0') && (c <= '9')
                    || (c == ' ')))) {
                return false;
            }
        }

        return true;
    }

    public static boolean CheckEmail(String email) {
        if (email == null) {
            return false;
        }
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    public static boolean Checknome(String nome) {
        if (nome == null) {
            return false;
        }
        if (nome.length() < nomeMin || nome.length() > nomeMax) {
            return false;
        }
        char[] a = nome.toCharArray();

        for (char c : a) {
            if (!(((c >= 'a') && (c <= 'z'))
                    || ((c >= 'A') && (c <= 'Z'))
                    || (c == ' '))) {
                return false;
            }
        }
        return true;
    }

    public static boolean ChecknCartao(String ncartao) {
        if (ncartao == null) {
            return false;
        }
        return (ncartao.matches("[0-9]+") && ncartao.length() == 16);
    }

    public static boolean CheckCSV(String csv) {
        if (csv == null) {
            return false;
        }
        return (csv.matches("[0-9]+") && csv.length() == 3);
    }
    
    public static boolean CheckData(String mes, String ano) {
        Calendar cal = Calendar.getInstance();
        if(mes == null || ano == null)
            return false;
        int mes1 = Integer.parseInt(mes);
        int ano1 = Integer.parseInt(ano);
        if (mes1 < Data.mesI || mes1 > Data.mesF || cal.get(Calendar.YEAR) > ano1) {
            return false;
        }
        if (cal.get(Calendar.YEAR) == ano1) {
            if (cal.get(Calendar.MONTH) < mes1) {
                return false;
            }
        }
        return true;
    }

}
