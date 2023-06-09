import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Loja loja = criarLoja(scanner);
                    System.out.println(loja);
                    break;
                case 2:
                    Produto produto = criarProduto(scanner);
                    Data dataAtual = new Data(20, 10, 2023);

                    if (produto.estaVencido(dataAtual)) {
                        System.out.println("PRODUTO VENCIDO");
                    } else {
                        System.out.println("PRODUTO NÃO VENCIDO");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 3);

        scanner.close();
    }

    private static Loja criarLoja(Scanner scanner) {
        scanner.nextLine();

        System.out.println("Informe o nome da loja:");
        String nome = scanner.nextLine();

        System.out.println("Informe a quantidade de funcionários da loja:");
        int qtdFuncionarios = scanner.nextInt();

        System.out.println("Informe o salário base dos funcionários da loja:");
        int salarioBase = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Informe a data de criação:");
        String data = scanner.nextLine();
        String[] partesData = data.split("/");
        Data dataCriacao = new Data(
                Integer.parseInt(partesData[0]),
                Integer.parseInt(partesData[1]),
                Integer.parseInt(partesData[2])
        );

        System.out.println("Informe a quantidade de estoque da loja:");
        int qtdEstoque = scanner.nextInt();
        scanner.nextLine();

        return new Loja(nome, qtdFuncionarios, salarioBase, cadastrarEndereco(scanner), dataCriacao, qtdEstoque);
    }

    private static Produto criarProduto(Scanner scanner) {
        scanner.nextLine();

        System.out.println("Informe o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Informe o preço:");
        double preco = scanner.nextDouble();

        System.out.println("Informe a data de vencimento (DD/MM/AAAA):");
        String data = scanner.next();
        String[] partesData = data.split("/");
        Data dataVencimento = new Data(
                Integer.parseInt(partesData[0]),
                Integer.parseInt(partesData[1]),
                Integer.parseInt(partesData[2])
        );

        return new Produto(nome, preco, dataVencimento);
    }

    private static Endereco cadastrarEndereco(Scanner scanner) {
        System.out.println("Informe a rua:");
        String rua = scanner.nextLine();

        System.out.println("Informe a cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Informe o estado:");
        String estado = scanner.nextLine();

        System.out.println("Informe o país:");
        String pais = scanner.nextLine();

        System.out.println("Informe o CEP:");
        String cep = scanner.nextLine();

        System.out.println("Informe o número:");
        String numero = scanner.nextLine();

        System.out.println("Informe o complemento:");
        String complemento = scanner.nextLine();

        return new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
    }
}
