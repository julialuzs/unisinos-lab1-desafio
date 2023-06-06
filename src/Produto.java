import java.util.Date;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual) {
        Date atual = new Date(dataAtual.getAno(), dataAtual.getMes(), dataAtual.getDia());
        Date vencimento = new Date(this.dataValidade.getAno(), this.dataValidade.getMes(), this.dataValidade.getDia());

        return atual.after(vencimento);
    }

    @Override
    public String toString() {
        String data = dataValidade != null ? ", Data de validade: " + dataValidade : null;
        return "Produto: " + nome +
                ", Preço: " + preco +
                data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
}
