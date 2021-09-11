//Scrivete una funzione che dato in input due numeri n ed m,
// crea un array lungo m che in ogni cella ha il valore di indice della cella moltiplicato per n


import java.util.Arrays;
import java.util.Scanner;

public class Tabellina {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Inserisci n: ");
        int n= sc.nextInt();
        System.out.print("Inserisci m: ");
        int m= sc.nextInt();

        System.out.println(Arrays.toString(tabellina(n,m)));

    }
    public static int[] tabellina(int n, int m ){

        int[] arrayM = new int[m];
        for(int i=0; i<arrayM.length; i++){
            arrayM[i]= i*n;
        }
        return arrayM;

 }

}
