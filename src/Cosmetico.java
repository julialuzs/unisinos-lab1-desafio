public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", Data Fundação: " + this.getDataFundacao().toString() +
                ", Taxa Comercializacao=" + taxaComercializacao +
                '}';
    }
}
