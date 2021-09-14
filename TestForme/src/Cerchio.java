public class Cerchio extends FiguraGeometrica {

    private double raggio;
    private double pGreco= 3.14;

    public Cerchio(double r){  //Costruttore

        raggio= r;
    }

    Colore NERO= new Colore(0,0,0);

    @Override // redefiniamo il metodo di una super classe
    public double area() {
        return (raggio*raggio*pGreco);
    }

    @Override // redefiniamo il metodo di una super classe
    public double perimetro() {
        return (2*pGreco*raggio);  //calcolo circonferenza
    }


  /*  public double circonferenza(){  //metodo/funzione
        return (2*pGreco*raggio);
    }
    public double area(){
        return (raggio*raggio*pGreco); //metodo/funzione
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }*/
}
