public abstract class  Prodotto {

    private int codiceUnivoco;
    private double prezzo;

    public Prodotto(int codiceUnivoco, double prezzo) {
        this.codiceUnivoco = codiceUnivoco;
        this.prezzo = prezzo;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public void setCodiceUnivoco(int codiceUnivoco) {
        this.codiceUnivoco = codiceUnivoco;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
