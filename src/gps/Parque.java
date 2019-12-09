
package gps;



public class Parque {
    private String[][] lug;
    
    public Parque(){
        lug = new String[][] {{"A1", "A2", "A3", "A4", "A5"}, {"B1", "B2", "B3", "B4", "B5"}, {"C1", "C2", "C3", "C4", "C5"}};   
    }
    
    public void imprime(){
        for(int i=0; i< 3; i++){
            for(int j=0; j<5; j++){
                System.out.print(lug[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
