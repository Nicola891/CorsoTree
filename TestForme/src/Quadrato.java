public class Quadrato extends FiguraGeometrica {

    private int lato; //dato per tutta la classe quadrato

    public Quadrato(int l) {  //Costruttore
        lato = l;
    }

    Colore NERO= new Colore(0,0,0);

    @Override // redefiniamo il metodo di una super classe
    public double area() {

        return (lato*lato);
    }

    @Override // redefiniamo il metodo di una super classe
    public double perimetro() {

        return (lato * 4);
    }



  /*  public int Perimetro() { // funzione/metodo del calcolo del perimetro
        return (lato * 4);
    }

    public int getLato() { //voglio ottenere un numero
        return lato;

    }

    public void setLato(int lato) { // dare un input
        this.lato = lato;*/
    }


