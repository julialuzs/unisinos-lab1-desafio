package dominio;

import java.util.*;
import java.util.stream.Stream;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;
    private int quantidadeLojas;

    public Shopping() {
    }

    public Shopping(String nome, Endereco endereco, int quantidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeLojas = quantidadeLojas;
        this.lojas = new Loja[quantidadeLojas];
    }

    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < quantidadeLojas; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < quantidadeLojas; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        List<Loja> lojasLista = Arrays.asList(lojas);
        switch (tipoLoja) {
            case "Cosmético":
                return (int) lojasLista.stream().filter(loja -> loja instanceof Cosmetico).count();
            case "Vestuário":
                return (int) lojasLista.stream().filter(loja -> loja instanceof Vestuario).count();
            case "Bijuteria":
                return (int) lojasLista.stream().filter(loja -> loja instanceof Bijuteria).count();
            case "Alimentação":
                return (int) lojasLista.stream().filter(loja -> loja instanceof Alimentacao).count();
            case "Informática":
                return (int) lojasLista.stream().filter(loja -> loja instanceof Informatica).count();
            default:
                return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro() {
        List<Loja> lojasLista = Arrays.asList(lojas);
        Stream<Loja> lojasInformatica = lojasLista.stream().filter(loja -> loja instanceof Informatica);

        Comparator comparator = Comparator.comparing(loja -> ((Informatica) loja).getSeguroEletronicos());

        Optional<Informatica> seguroMaisCaro = lojasInformatica.max(comparator);

        return seguroMaisCaro.orElse(null);
    }

    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + lojas.toString() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public int getQuantidadeLojas() {
        return quantidadeLojas;
    }

    public void setQuantidadeLojas(int quantidadeLojas) {
        this.quantidadeLojas = quantidadeLojas;
    }
}
