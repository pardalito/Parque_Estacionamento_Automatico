package gps;

public final class Carro {

    private final String marca;
    private final String modelo;
    private String matricula;
    
    //private Utilizador utilizador; //o utilizador é que tem carros nao o contrario
    
    public Carro(String marca, String modelo, String matricula){
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        //fazer verificações antes de enviar para o construtor
        /*
        if(setMatricula(matricula) == false){
            System.out.println("Matricula incorreta");
            System.exit(0);
        }
        */
    }
    
    public boolean setMatricula(String matricula){
        //valida o tamanho e a posição do caracter "-"
       if (matricula.length() != 8 || matricula.charAt(2) != '-' || matricula.charAt(5) != '-')
           return false;
       int numeros = 0, letras = 0;

       for (int i = 0; i < matricula.length(); i++) {

           //verifica se é letra 
            if (Character.isLetter(matricula.charAt(i))) {

               //verifica se é letra Maiuscula se sim incretenta se não, nao incrementa
               if (matricula.charAt(i) == (matricula.toUpperCase().charAt(i))) {
                    ++letras;
                    continue;
                }
            }
           //verifica se é digito e se sim, incrementa
            if (Character.isDigit(matricula.charAt(i)))
                ++numeros;
           //parte do codigo que valida a condição NN-CC-NN, CC-NN-NN, NN-NN-CC
            if (i == 2){
                if (numeros != 2 && letras != 2)
                    return false;
            }
            if (i == 4){
               if ((numeros != 2 || letras != 2) && (numeros != 4))
                    return false;
            }
        }
       //verifica se a matricula contem os 4 numeros e 2 letras maiusculas
       if (numeros == 4 && letras == 2){
           this.matricula = matricula;
           return true;
       }
       return false;
    }
    
    public final String getMarca(){
        return marca;
    }
    public final String getMatricula(){
        return matricula;
    }
    public final String getModelo(){
        return modelo;
    }
    /*
    public final Utilizador getUtilizador(){
        return utilizador;
    }
    
    public void setUtilizador(Utilizador uti){
        this.utilizador = uti;
    }
    */
}