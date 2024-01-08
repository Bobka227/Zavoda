  
package zavodnikmain;

public class ZavodnikZaznam {
    Zavodnik[] zavod;
    private int pocet;
    private String jmeno;

    public ZavodnikZaznam(String jmeno, int kapacita) {
        this.zavod = new Zavodnik[kapacita];
        this.pocet = 0;
        this.jmeno = jmeno;
    }
    
    
    public void pridejZavodnika(Zavodnik zavodka){
      if(pocet < zavod.length){
        zavod[pocet] = zavodka;
        pocet++;
      }else{
          System.out.println("prestupuje kapacitu");
      }
 
    }
    
    
    public void VypisZavodnika(){
        System.out.println("Zavod: " + jmeno);
        for(int i =0; i < pocet; i++ ){
            System.out.println(zavod[i]);
            
        }
        
    }
    
    public Zavodnik lepsiCas(){
        Zavodnik lepsi = zavod[0];
        for(int i = 0; i < pocet; i++){
            if(zavod[i].getDruhycas()<lepsi.getDruhycas() || zavod[i].getPrvnicas() < lepsi.getPrvnicas()){
              lepsi = zavod[i];  
            }
            
        }
        System.out.println("lepsi je: " + lepsi);
        return lepsi;
    }



    public double PrumernyVykon(){
        double prumer =0;
        double sum = 0;
        for(int i =0; i< pocet; i++){
            sum = zavod[i].getPrvnicas() + zavod[i].getDruhycas();
            prumer +=sum;
            
        }
        
        return sum / pocet;
        
    }    
   public void setBool(){
       for(int i =0; i<pocet; i++){
           if(zavod[i].Sumka() < 12){
               zavod[i].setLoh(true);
               System.out.println(zavod[i]);
           }
       }
       
       
   }
    public void TopPracovnike(int top){
        if(pocet == 0){
            
            System.out.println("Nemate zadny zaznam o prfcovnikach");
            return;
        }
        
        int limit = (top < pocet )  ? top : pocet; 
        
        for(int i =0; i < limit; i++ ){
            int mensiindex = i;
            for(int j = i + 1 ; j < pocet; j++  ){
                if(zavod[j].getDruhycas() < zavod[mensiindex].getDruhycas() && zavod[j].getPrvnicas() < zavod[mensiindex].getPrvnicas()  ){
                    mensiindex = j;
                    
                }
               
            }
            
            
            Zavodnik daun = zavod[i];
            zavod[i] = zavod[mensiindex];
            zavod[mensiindex] = daun;
            
            
        }
        System.out.println("TOP " + top + " zavodniku podle druhych hodin");
        for(int i = 0; i < limit; i++){
            System.out.println( (i + 1) + " misto: " + zavod[i].getJmano() + " " + zavod[i].getDruhycas() + " hod" );
           
        }
        System.out.println("  ");
        System.out.println("TOP " + top + " zavodniku podle prvnich hodin");
        
        for(int i =0; i < limit; i++){
            System.out.println( (i + 1) + " misto: " + zavod[i].getJmano() + " " + zavod[i].getPrvnicas()+ " hod" );
           
        }
        
        
        
    }
   
    
    
}
