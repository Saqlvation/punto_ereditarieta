public class TestPuntoOrientato {
public static void main(String[] args) {
     PuntoOrientato d = new PuntoOrientato(2,4,"sinistra");
    
     System.out.println(d);
     d.sposta(5);
     System.out.println(d);


    d.ruotaDestra();
    System.out.println(d);
    PuntoOrientato e = new PuntoOrientato(-3,4,"basso");
    System.out.println(e.equals(d));   


}
}
