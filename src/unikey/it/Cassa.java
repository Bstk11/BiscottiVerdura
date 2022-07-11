package unikey.it;

public class Cassa {


    public double generaScontrino(Carrello carrello) {
        double totale = 0;
        for (Prodotto p : carrello.getListaProdotti()) {
            if (p instanceof Verdura) {
                totale += ((Verdura) p).definisciPrezzo();

            } else if (p instanceof Biscotti) {
                totale += ((Biscotti) p).definisciPrezzo();

            }


        }
        return totale;


    }
}
