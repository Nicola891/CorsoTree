public abstract class FiguraGeometrica {
    private Colore colore = Colore.NERO;

    public Colore getColore() {
        return colore;
    }

    public void setColore(Colore colore) {
        this.colore = colore;
    }

    public abstract double area();

    public abstract double perimetro();

}
