package unikey.it;

import java.util.Arrays;

public class Carrello {
    final int a = 10;
    private Prodotto[] listaProdotti;

    public Carrello(Prodotto[] listaProdotti) {
        this.listaProdotti = new Prodotto[a];
    }

    public Prodotto[] getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(Prodotto[] listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "Carrello:\n" +
                "listaProdotti=" + toStringArray(listaProdotti)
                ;
    }


    private String toStringArray(Prodotto[] prodotti) {
        String array = "";
        for (Prodotto prodotto : prodotti) {

            if (prodotto != null) {
                array += prodotto.toString() + "\n";


            }

        }
        return array;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        for (int i = 0; i < listaProdotti.length; i++) {
            if (listaProdotti[i] == null) {
                listaProdotti[i] = prodotto;
                break;
            }

        }


    }


    public void eliminaProdotto(Prodotto prodotto) {
        for (int i = 0; i < listaProdotti.length; i++) {
            if (listaProdotti[i].equals(prodotto)) {
                listaProdotti[i] = null;
                break;
            }

        }


    }
}
