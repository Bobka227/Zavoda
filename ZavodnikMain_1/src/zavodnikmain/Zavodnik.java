
package zavodnikmain;

public class Zavodnik {
    private String jmano;
    private int prvnicas;
    private int druhycas;
    private boolean loh;
   
    public Zavodnik(String jmano, int prvnicas, int druhycas) {
        this.jmano = jmano;
        this.prvnicas = prvnicas;
        this.druhycas = druhycas;
        this.loh = false;
        
    }
    
    public int Sumka(){
       int sumka = (int)prvnicas + (int)druhycas;
        return sumka;
    }
    
   
    public void setLoh(boolean loh) {
        this.loh = loh;
    }

    public boolean isLoh() {
        return loh;
    }

   
    

    public String getJmano() {
        return jmano;
    }

    public int getPrvnicas() {
        return prvnicas;
    }

    public int getDruhycas() {
        return druhycas;
    }

    @Override
    public String toString() {
        return "Zavodnik{" + "Jmeno: " + jmano + ", Prvni Cas: " + prvnicas + " hod" + ", Druhy Cas: " + druhycas + " hod" + '}';
    }
    
    
    
    
     
    
}
