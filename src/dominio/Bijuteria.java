package dominio;

public class Bijuteria extends Loja {

    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double metaVendas) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "Bijuteria {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", Data Fundação: " + this.getDataFundacao().toString() +
                ", Meta vendas: " + metaVendas +
                '}';
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }
}
