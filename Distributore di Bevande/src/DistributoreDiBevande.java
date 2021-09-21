public class DistributoreDiBevande {
    private Prodotto[] listaProdotti;
    private double saldo;


    public DistributoreDiBevande(int lunghezzaLista) {
        this.listaProdotti = new Prodotto[lunghezzaLista];
        this.saldo = 0;
    }

    public Prodotto[] getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(Prodotto[] listaProdotti) {
        this.listaProdotti = listaProdotti;
    }


    public void caricaProdotto(Prodotto p) {

        for (int i = 0; i < listaProdotti.length; i++) {
            listaProdotti[i] = p;
        }
    }

    public void inserisciImporto(double contantiInseriti) {

        //Controllo se il prezzo è inferiore. Sennò sei Emily.
        if (contantiInseriti < 0.50) {
            System.out.println("Importo insufficente");
        }
        if (contantiInseriti >= 0.50) {
            System.out.println("Selezionare Prodotto");
        }


    }
        //d.scegliProdotto(1, 0.01, 400000000)
    public Prodotto scegliProdotto(int codiceUnivoco) {
        Prodotto p = null;
        for (int i = 0; i < listaProdotti.length; i++) {
            //cercare il prodotto con codice codiceUnivoco
            //confrontare prezzo e saldo, se possibile acquisto
            if(listaProdotti[i] == null)
                continue;
            if(listaProdotti[i].getCodiceUnivoco() == codiceUnivoco &&
                    listaProdotti[i].getPrezzo() <= saldo) {
                p = listaProdotti[i];
                //decrementare saldo
                saldo -= p.getPrezzo();
                //rimuovere prodotto
                listaProdotti[i] = null;
            }
            else if(listaProdotti[i].getPrezzo() > saldo) {
                System.out.println("Saldo insufficiente");
            }
        }


       /* if (codiceUnivoco.getCodiceUnivoco() == 01) {
            System.out.println("Prodotto Selezionato Caffe");
        }
        if (codiceUnivoco.getCodiceUnivoco() == 02) {
            System.out.println("Prodotto Selezionato Cappuccino");
        } else {
            System.out.println("Prodotto non Disponibile");
        }
        if(saldo > prezzo.getPrezzo()){
            double saldoAttuale =  saldo - prezzo.getPrezzo();

        }*/
        return p;
    }

    public double saldoAttuale() {
        return saldo;
    }

    public double resto(){
        double resto = saldoAttuale();
        //resto = 0.2
        saldo = 0;
        //saldo = 0
        return resto; // 0.2;
    }


}
