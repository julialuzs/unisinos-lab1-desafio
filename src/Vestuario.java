public class Vestuario extends Loja {

    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
                     Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Vestuário {" +
                "Nome: " + this.getNome() + '\'' +
                ", Quantidade Funcionários: " + this.getQuantidadeFuncionarios() +
                ", Salário Base Funcionário: " + this.getSalarioBaseFuncionario() +
                ", Endereço: " + this.getEndereco().getCidade() + this.getEndereco().getNumero() +
                ", Data Fundação: " + this.getDataFundacao().toString() +
                ", Produtos Importados: " + produtosImportados +
                '}';
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
}
