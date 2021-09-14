
public class TestForme {
    public static void main(String[] args) {
        int l = 4;
        double r = 5;

        Quadrato q = new Quadrato(l);
        q.setColore(new Colore(0,0,0)); // definiamo che il colore è nero


        Cerchio c = new Cerchio(r);
        Cerchio a = new Cerchio(r);
        c.setColore(new Colore(0,0,0)); // definiamo che il colore è nero


        System.out.println("il perimetro è = " + q.perimetro());
        System.out.println("l' area del quadrato è = " + q.area());
        System.out.println("il raggio è = " + c.perimetro());
        System.out.println("L'Area è = " + a.area());
        System.out.println("il colore delle forme giometriche è =" + Colore.NERO);

    }
}
