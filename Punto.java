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
}