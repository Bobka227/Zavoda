
package zavodnikmain;

public class ZavodnikMain {

    public static void main(String[] args) {
        
        ZavodnikZaznam zaz1 = new ZavodnikZaznam("Bebrovka",10);
        
        Zavodnik zav1 = new Zavodnik("Alexei",7,9);
        Zavodnik zav2 = new Zavodnik("Anna", 10,12);
        Zavodnik zav3 = new Zavodnik("Lebro", 5,8);
        Zavodnik zav4 = new Zavodnik("Cuspan",3,7);
        
        zaz1.pridejZavodnika(zav1);
        zaz1.pridejZavodnika(zav2);
        zaz1.pridejZavodnika(zav3);
        zaz1.pridejZavodnika(zav4);
        
        zaz1.VypisZavodnika();
        
        zaz1.TopPracovnike(4);
        System.out.println("");
        
        Zavodnik lepsi = zaz1.lepsiCas();
        System.out.println("Lepsi je: " + lepsi.getJmano());
        
        System.out.println(" ");
        
        double prumer = zaz1.PrumernyVykon();
        System.out.println("Prukmer pracovniku: "  + prumer );
         
         
        System.out.println(" ");
        
        zaz1.setBool();
        System.out.println(zav1.getJmano() + (zav1.isLoh() ? " krasava" : " loshara"));
        System.out.println(zav2.getJmano() + (zav2.isLoh() ? " krasava" : " loshara"));
        System.out.println(zav3.getJmano() + (zav3.isLoh() ? " krasava" : " loshara"));
        System.out.println(zav4.getJmano() + (zav4.isLoh() ? " krasava" : " loshara"));
        
        
    }
    
}
