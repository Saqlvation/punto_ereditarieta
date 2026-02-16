public class PuntoOrientato extends Punto {
    private String orientamento = "";
    

    PuntoOrientato(int x, int y, String orientamento){
        super(x,y);
        setOrientamento(orientamento);
    }
    PuntoOrientato(){
        super(0,0);
        setOrientamento("default");
    }


    public void setOrientamento(String orientamento){
        if(orientamento.equalsIgnoreCase("alto")|| orientamento.equalsIgnoreCase("basso") 
           || orientamento.equalsIgnoreCase("destra") || orientamento.equalsIgnoreCase("sinistra")) {
        this.orientamento = orientamento;
           }
           else
            this.orientamento = "errore";
    }

    public String getOrientamento(){
        return orientamento;
    }

    public void ruotaDestra(){
        if(orientamento.equalsIgnoreCase("alto")){
            this.orientamento = "destra";
        }
        else if(orientamento.equalsIgnoreCase("destra")){
            this.orientamento = "basso";
        }
        else if(orientamento.equalsIgnoreCase("basso")){
            this.orientamento = "sinistra";
        }
        else if(orientamento.equalsIgnoreCase("sinistra")){
            this.orientamento = "alto";
        }
    }

            public void ruotaSinistra(){
        if(orientamento.equalsIgnoreCase("alto")){
            this.orientamento = "sinistra";
            return;
        }
        if(orientamento.equalsIgnoreCase("destra")){
            this.orientamento = "alto";
            return;
        }
        if(orientamento.equalsIgnoreCase("basso")){
            this.orientamento = "destra";
            return;
        }
        if(orientamento.equalsIgnoreCase("sinistra")){
            this.orientamento = "basso";
            return;
        }
    }
        

    public void sposta(int k){
        if(orientamento.equalsIgnoreCase("alto")){
            traslaY(k);
        }
        if(orientamento.equalsIgnoreCase("basso")){
            traslaY(-k);
        }
        if(orientamento.equalsIgnoreCase("destra")){
            traslaX(k);
        }
        if(orientamento.equalsIgnoreCase("sinistra")){
            traslaX(-k);
        }
    }



    public String toString(){
        return super.toString() + " orientato a : " + orientamento + "\n" ;
 
    }
    
}
