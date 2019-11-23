package gps;

import java.util.Scanner;


public class GPS {
    
//    int n_c, cod, pergunta;
//    Data val;
//    String nome_comp, e_mail, passwd, resposta_s;
    
    
//    public Utilizador criarUtilizador(){
//        Scanner sc = new Scanner(System.in);
//        
//        if(sc.hasNext())    nome_comp = sc.next();
//        if(sc.hasNext())    e_mail = sc.next();
//        if(sc.hasNext())    passwd = sc.next();
//        if(sc.hasNext())    n_c = sc.nextInt();
//        if(sc.hasNext())    cod = sc.nextInt();
//        if(sc.hasNext())    val.mes = sc.nextInt();
//        if(sc.hasNext())    val.ano = sc.nextInt();
//        if(sc.hasNext())    pergunta = sc.nextInt();
//        if(sc.hasNext())    resposta_s = sc.next(); 
//        
//        System.out.println("Nome Completo: "+nome_comp);
//        System.out.println("E-mail: "+e_mail);
//        System.out.println("Password: "+passwd);
//        System.out.println("Numero de Cartao de Credito: "+n_c);
//        System.out.println("CSV: "+cod);
//        System.out.println("Validade: "+val.mes+"/"+val.ano);
//        System.out.println("Pergunta de Segurança: "+pergunta);
//        System.out.println("Resposta: "+resposta_s);
//        
//        return new Utilizador(nome_comp, e_mail, passwd, n_c, cod, val, pergunta, resposta_s);
//    }
    
    
    public static void main(String[] args) {
        
        //GPS gps = new GPS();
        //Utilizador user = gps.criarUtilizador();
        
        Scanner sc = new Scanner(System.in);
        int n_c, cod, pergunta;
        Data val = new Data();
        String nome_comp, e_mail, passwd, resposta_s;
        
        /*if(sc.hasNext())*/    nome_comp = sc.next();
        /*if(sc.hasNext())*/     e_mail = sc.next();
        /*if(sc.hasNext())*/     passwd = sc.next();
        /*if(sc.hasNext())*/     n_c = sc.nextInt();
        /*if(sc.hasNext())*/     cod = sc.nextInt();
        /*if(sc.hasNext())*/     val.mes = sc.nextInt();
        /*if(sc.hasNext())*/     val.ano = sc.nextInt();
        /*if(sc.hasNext())*/     pergunta = sc.nextInt();
        /*if(sc.hasNext())*/     resposta_s = sc.next();
        
        Utilizador user = Utilizador(nome_comp,e_mail,passwd,n_c,cod,val,pergunta,resposta_s);
        
        System.out.println("\n\n");
        System.out.println("Nome Completo: "+user.getNome_completo());
        System.out.println("E-mail: "+user.getEmail());
        System.out.println("Password: "+user.getPassword());
        System.out.println("Numero de Cartao de Credito: "+user.getNum_cartao());
        System.out.println("CSV: "+user.getCsv());
        System.out.println("Validade: "+user.getValidade().mes+"/"+user.getValidade().ano);
        System.out.println("Pergunta de Segurança: "+user.getPerg_segur());
        System.out.println("Resposta: "+user.getResposta_seguranca());       
        
    }

    
}
