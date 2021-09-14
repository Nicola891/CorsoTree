public class Colore {
    public static final Colore NERO = new Colore(0,0,0);
    public static final Colore BIANCO = new Colore(255,255,255);
    int r, g, b;

    public Colore(int r, int g, int b) {  //Costruttore
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "(" + r + "," + g + "," + b + ")";
    }
}

