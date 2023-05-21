package dominio;

public class Informatica extends Loja {

    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, double seguroEletronicos) {

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 0);
        this.seguroEletronicos = seguroEletronicos;
    }

    public Informatica(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, double seguroEletronicos, int quantidadeEstoque) {

        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Alimentacao {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", Data Fundação: " + this.getDataFundacao().toString() +
                ", Seguro Eletrônicos: " + seguroEletronicos +
                '}';
    }

    public Double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }
}
