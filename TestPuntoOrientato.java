public class TestPuntoOrientato {
public static void main(String[] args) {
     PuntoOrientato d = new PuntoOrientato(2,4,"sinistra");
     System.out.println(d);
     d.sposta(5);
     System.out.println(d);


    d.ruotaDestra();
    System.out.println(d);
   


}
}
