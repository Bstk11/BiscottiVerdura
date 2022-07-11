package unikey.it;

import java.util.Objects;

public class Verdura implements Prodotto {


    private String nome;
    private int peso;

    public Verdura(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int getComponenteFissa() {
        return 0;
    }

    @Override
    public String toString() {
        return "Verdura{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                '}';
    }

    public double definisciPrezzo(){
        double prezzo = 0;
        prezzo = Prodotto.componenteFissa * getPeso();
        return prezzo;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Verdura verdura = (Verdura) o;
        return peso == verdura.peso && Objects.equals(nome, verdura.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, peso);
    }
}
