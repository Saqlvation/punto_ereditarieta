public class Punto {
    private int x;
    private int y;


    Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    Punto(){
        this.x = 0;
        this.y = 0;
    }

    Punto(Punto altroPunto){
        if (altroPunto!=null){
            this.x = altroPunto.x;
            this.y = altroPunto.y;
        }
        else
            this.x = 0;
            this.y = 0;
    }


    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }



    public void traslaX(int k){
        x += k;
    }

    public void traslaY(int k){
        x+=k;
    }


    public String toString(){
        return " Coordinate : (" + x + ";" + y + ")";
    }
        @Override
    public boolean equals(Object altroOggetto) {
        if (altroOggetto == null)
            return false;
        if (altroOggetto == this)
            return true;
        if (!(altroOggetto instanceof Punto))
            return false;
        Punto altroPunto = (Punto)altroOggetto;
        return 
                 x == altroPunto.x && y == altroPunto.y;
    }
}
