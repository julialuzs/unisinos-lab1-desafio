package dominio;

public class Alimentacao extends Loja {

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
                       Endereco endereco, Data dataFundacao, Data dataAlvara) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "Alimentacao {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", data Fundação: " + this.getDataFundacao().toString() +
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
