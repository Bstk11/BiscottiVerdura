package unikey.it;

public class Main {
    public static void main(String[] args) {

        Biscotti biscotti1 = new Biscotti("pan di stelle", "media");
        Biscotti biscotti2 = new Biscotti("gocciole", "grande");
        Biscotti biscotti3 = new Biscotti("abbracci", "piccola");
        Verdura verdura1 = new Verdura("broccoli", 2);
        Verdura verdura2 = new Verdura("melanzane", 4);
        Verdura verdura3 = new Verdura("zucchine", 1);
        Verdura verdura4 = new Verdura("zucchine", 1);
        Carrello carrello1 = new Carrello(null);

        System.out.println(biscotti1.definisciPrezzo());
        System.out.println(biscotti2.definisciPrezzo());
        System.out.println(biscotti3.definisciPrezzo());
        System.out.println(verdura1.definisciPrezzo());
        System.out.println(verdura2.definisciPrezzo());
        System.out.println(verdura3.definisciPrezzo());

        carrello1.aggiungiProdotto(verdura1);
        carrello1.aggiungiProdotto(verdura2);
        carrello1.aggiungiProdotto(verdura3);
        System.out.println(carrello1.toString());
        carrello1.eliminaProdotto(verdura1);
        System.out.println(carrello1.toString());
        Cassa cassa1 = new Cassa();
        System.out.println(cassa1.generaScontrino(carrello1));
    }
}
