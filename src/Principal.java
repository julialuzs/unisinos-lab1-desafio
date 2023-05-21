import dominio.Data;
import dominio.Endereco;
import dominio.Loja;
import dominio.Produto;

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
                    criarLoja();
                    break;
                case 2:
                    criarProduto();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        } while (opcao != 3);
    }

    private static void criarLoja() {
        Endereco endereco = new Endereco("Tres de Outubro", "Novo Hamburgo",
                "Rio Grande do Sul", "Brasil", "1920313", "120", "Casa");

        Loja loja = new Loja("Renner", 50, endereco, new Data(10, 10, 2020), 5);

        System.out.println(loja);
    }

    private static void criarProduto() {
        Produto produto = new Produto("Perfume", 500, new Data(15, 5, 2023));
        Data dataAtual = new Data(20, 10, 2023);

        if (produto.estaVencido(dataAtual)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }
}
