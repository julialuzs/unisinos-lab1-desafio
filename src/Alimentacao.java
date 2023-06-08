public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Data dataAlvara, int quantidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentação {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", Data Fundação: " + this.getDataFundacao().toString() +
                ", Data Alvará: " + dataAlvara +
                '}';
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
}
