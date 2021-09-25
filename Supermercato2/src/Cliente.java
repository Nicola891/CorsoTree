package Cliente;
import java.util.Iterator;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    private String nome;
    private String cognome;
    private int eta;
    private int idUnivoco;

    public Cliente(String nome, String cognome, int eta, int idUnivoco) { //costruttore
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.idUnivoco = idUnivoco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getIdUnivoco() {
        return idUnivoco;
    }

    public void setIdUnivoco(int idUnivoco) {
        this.idUnivoco = idUnivoco;
    }

    @Override
    public boolean equals(Object o) {   //Il metodo equals di un oggetto lo confronta con un altro oggetto in input e
        //ritorna true se sono uguale, false altrimenti
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return idUnivoco == cliente.idUnivoco;
    }

    @Override
    public int hashCode() {  //coerenza nell’esecuzione del nostro codice
        return Objects.hash(idUnivoco);
    }

    //this -> 50
    //o -> 30
    @Override
    public int compareTo(Cliente o) { //compara età cliente in fila
        return -(this.eta - o.getEta());
    }

}

