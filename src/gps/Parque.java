
package gps;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Parque {
    private ArrayList<Lugar> lugares;
    
    public Parque(){
        lugares = new ArrayList<>();
        File bd = new File("bdparque.txt");
        
        Scanner scan = null;
        try {
            scan = new Scanner(bd);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Parque.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        while(scan.hasNextLine()){
            
            String nome = scan.nextLine().trim();
            String livre = scan.nextLine().trim();
            String qualidade = scan.nextLine().trim();
            
            if(nome != null || livre != null || qualidade != null){
                int x = Integer.parseInt(qualidade.trim());
                lugares.add(new Lugar(nome, livre, x));
            }
            
        }
        scan.close();
    }
    
    public String MelhoresLugares(){
        String tresmelhores = "";
        String primeiro = ""; int PrimQ = 0;
        String segundo = ""; int SecQ = 0;
        String terceiro = ""; int TerQ = 0;
        
        for(Lugar c: lugares){
            if(c.isLivre().compareTo("livre")==0){
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
    
    public ArrayList<Lugar> getPagamentos(){
        return lugares;
    }
    
}
