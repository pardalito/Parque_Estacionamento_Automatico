package gps;

public class Carro {
    
    private String marca, modelo, matricula;
    //private Utilizador utilizador;
    
    public Carro(String marca, String modelo, String matricula, Utilizador utilizador){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        //this.utilizador = new Utilizador();
    }
    
    public boolean setMatricula(String matricula){
        if(matricula.charAt(2) == '-' &&  matricula.charAt(5)== '-')
            ;//verificar tambem o padrao, se esta letras num lado nao 
             //pode estar noutro e ver se estao em caps
        return false;
    }
    
    public String getMarca(){
        return marca;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getModelo(){
        return modelo;
    }
    
}
