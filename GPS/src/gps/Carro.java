package gps;

public class Carro {
    
    private String marca, modelo, matricula;
    private Utilizador utilizador;
    
    public Carro(String marca, String modelo, String matricula, Utilizador utilizador){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.utilizador = new Utilizador();
    }
    
    public boolean setMatricula(String matricula){
        if(matricula[2] == '-' && matricula[5] == '-')
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
