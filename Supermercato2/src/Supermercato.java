import Cliente.Cliente;
import java.util.TreeSet;


public class Supermercato {

    private TreeSet<Cliente> lista; //lista per priorità

    public Supermercato() {
        this.lista = new TreeSet<Cliente>();
    }

    public void aggiungiCliente(Cliente cliente) {
        lista.add(cliente);
    }

    public void rimuoviCliente(Cliente cliente) {
        lista.remove(cliente);
    }

    public Cliente prossimoCliente() {
        return lista.pollFirst();
    }

    public int lunghezza() {
        return lista.size();
    }



}

