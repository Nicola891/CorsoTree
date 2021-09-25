import Cliente.Cliente;

import java.util.*;

import java.util.LinkedList;
import java.util.Queue;


/** Esercizio Supermercato versione 2 🛴

 Scrivere un programma Java che permetta di gestire la coda di un supermercato.
 In particolare, deve essere possibile eseguire le seguenti operazioni:

 - inserimento in coda di un cliente
 - rimozione dalla coda di un cliente
 - ottenere prossimo cliente da servire
 - ottenere il numero di clienti attualmente in coda

 Ogni cliente ha nome, cognome, età e un id univoco.
 La coda, ovviamente, va gestita secondo la politica FIFO.

 PLUS 🏍 : Modificare la coda per favorire le persone più anziane

 Suggerimento: scegliete bene la struttura dati (una possibile soluzione potrebbe
 essere la public class PriorityQueue che è un tipo di coda fornito da Java ad esempio...) **/


public class TestMain {

        public static void main(String[] args) {

        Queue <Cliente> lista = new LinkedList<Cliente>();

            Supermercato supermercato = new Supermercato();

            Cliente c = new Cliente("Mario", "Rossi", 29, 0121 );
            Cliente c1 = new Cliente ("Giampero", "Ulisse", 78, 0123);
            Cliente c2 = new Cliente ("Ugo", "Bassi", 85, 0236);
            Cliente c3 = new Cliente("Gumball", "Watterson", 15, 0521);


            // richiamo comando Agggiungi Cliente alla coda
            supermercato.aggiungiCliente(c);
            supermercato.aggiungiCliente(c1);
            supermercato.aggiungiCliente(c2);
            supermercato.aggiungiCliente(c3);

            // Rimuovi il primo Cliente dalla coda
            supermercato.rimuoviCliente(c);

            // trova il Prossimo Cliente
            supermercato.prossimoCliente();

            // trova Lunghezza Coda
            supermercato.lunghezza();
            System.out.println("La lista delle persone in attesa è: " + supermercato.lunghezza());
}


}






/*import java.util.*;

public class Esercizio {

    public static void main(String[] args) {
        ArrayList<Frutto2> lista = new ArrayList<>();
        Frutto2 f = new Frutto2();
        lista.add(f);
        lista.remove(0);
        lista.remove(f);
        for (int i = 0; i < lista.size(); i++) {
            Frutto2 ff = lista.get(i); // array[i]
        }
        int indice = lista.indexOf(f); //ritorna l'indice se trovato
        boolean trovato = lista.contains(f); //ritorna true se lo trova
        ////////////////
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        s.add(2);
        s.add(3);
        s.add(3);
        s.retainAll(s1); //mi mantiene in s solo l'intersezione tra i due
        s1.addAll(s);

        ///////////////
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "ciao");
        m.put(2, "ciao");
        for (Integer chiave : m.keySet()) { //scorriamo le chiavi
            System.out.println(m.get(chiave)); //per ogni chiave prendiamo il valore corrispondente
        }

        //////////
        Map<Integer, List<Integer>> m2 = new HashMap<>();
        List<Integer> l = m2.get(1); //ottengo valore

        Map<String, Map<String, List<String>>> m3 = new HashMap<>();
        Map<String, List<String>> ll = m3.get("ciao");
        List<String> k = ll.get("");

    }

}

class Frutto2 {

}*/
