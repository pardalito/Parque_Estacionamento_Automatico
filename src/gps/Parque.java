
package gps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Parque {
    private ArrayList<Lugar> lugares;
    
    public Parque() throws FileNotFoundException{
        File bd = new File("bdparque.txt");
        
        Scanner scan = new Scanner(bd);
        
        
        while(scan.hasNextLine()){
            String nome = scan.nextLine();
            String livre = scan.nextLine();
            String qualidade = scan.nextLine();
            lugares.add(new Lugar(nome, livre, qualidade));
        }
    }
    
    public String MelhoresLugares(){
        String tresmelhores = "";
        String primeiro = ""; int PrimQ = 0;
        String segundo = ""; int SecQ = 0;
        String terceiro = ""; int TerQ = 0;
        
        for(Lugar c: lugares){
            if(c.isLivre()){
                if(c.getQualidade()>TerQ){
                    if(c.getQualidade()>SecQ){
                        if(c.getQualidade()>PrimQ){
                            terceiro = segundo;
                            TerQ = SecQ;
                            segundo = primeiro;
                            SecQ = PrimQ;
                            primeiro = c.getNome();
                            PrimQ = c.getQualidade();
                        }else{
                            terceiro = segundo;
                            TerQ = SecQ;
                            segundo = c.getNome();
                            SecQ = c.getQualidade();
                            
                        }
                    }else{
                        terceiro = c.getNome();
                        TerQ = c.getQualidade();
                    }
                }
            }
            
        }
        tresmelhores += primeiro; tresmelhores += " "; tresmelhores += segundo; tresmelhores += " "; tresmelhores += terceiro;
        return tresmelhores;
        
    }
    
}
