package dominio;

import java.util.Arrays;
import java.util.List;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private int salarioBaseFuncionario;
    private int quantidadeEstoque;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja() {
    }

    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                Endereco endereco, Data dataFundacao, int quantidadeEstoque) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueProdutos = new Produto[quantidadeEstoque];
    }

    public int gastosComSalario() {
        if (this.salarioBaseFuncionario == -1) {
            return -1;
        }
        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    public char tamanhoDaLoja() {
        if (this.quantidadeFuncionarios < 10) {
            return 'P';
        }
        if (this.quantidadeFuncionarios >= 31) {
            return 'G';
        }
        return 'M';
    }

    public void imprimeProdutos() {
        for (Produto produto: estoqueProdutos) {
            if (produto != null) {
                System.out.println(produto.toString());
            }
        }
    }

    public boolean insereProduto(Produto produto) {
        for (int i = 0; i < quantidadeEstoque; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto;
                return true;
            }
        }
       return false;
    }

    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < quantidadeEstoque; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String estoqueProdutos = Arrays.toString(getEstoqueProdutos());

        String enderecoString = endereco != null ? (", endereço=" + endereco.getCidade() + endereco.getNumero() ) : null;
        String data = dataFundacao != null ? (", data=" + dataFundacao) : null;

        return "Loja {" +
                "nome='" + nome + '\'' +
                ", quantidadeFuncionarios=" + quantidadeFuncionarios +
                ", salarioBaseFuncionario=" + salarioBaseFuncionario +
                enderecoString +
                data +
                estoqueProdutos +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(int salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
}
