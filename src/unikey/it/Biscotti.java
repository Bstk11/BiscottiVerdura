package unikey.it;

import java.util.Objects;

public class Biscotti implements Prodotto{

    private String tipoConfezione;
    private String nome;


    public Biscotti(String nome, String tipoConfezione) {

        this.nome = nome;
        this.tipoConfezione = tipoConfezione;
    }

    public String getTipoConfezione() {
        return tipoConfezione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipoConfezione(String tipoConfezione) {
        this.tipoConfezione = tipoConfezione;
    }

    @Override
    public int getComponenteFissa() {
        return 0;
    }

    @Override
    public String toString() {
        return "Biscotti{" +
                "tipoConfezione='" + tipoConfezione + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public double definisciPrezzo(){

        double prezzo = 0;
        if(getTipoConfezione().equals("grande")){
            prezzo = componenteFissa * 2;
        } else if (getTipoConfezione().equals("media")) {
            prezzo = componenteFissa + (componenteFissa/2);
        }else{
            prezzo = componenteFissa;
        }

        return prezzo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biscotti biscotti = (Biscotti) o;
        return Objects.equals(tipoConfezione, biscotti.tipoConfezione) && Objects.equals(nome, biscotti.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipoConfezione, nome);
    }
}
