import modelos.CartaoDeCredito;
import modelos.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<Produto> listadeprodutos = new ArrayList<>();

        int opcao = 1;
        double limite = 0.0;
        double preco = 0.0;
        String nome = "";

        System.out.println(" Digite o limite do cartão : ");
        limite = leitura.nextDouble();
        CartaoDeCredito cartaoAmanda = new CartaoDeCredito(limite);

        while (opcao != 0) {

            if(opcao == 1) {

                System.out.println("Digite a descrição da compra:");
                leitura.nextLine();
                nome = leitura.nextLine();

                System.out.println("Digite o valor da compra:");
                preco = leitura.nextDouble();

                Produto produto = new Produto(nome, preco);

                boolean compraRealizada = cartaoAmanda.comprarNoCredito(produto);

                System.out.println("Valor do retorno do comprou : " + compraRealizada);

                if (compraRealizada) {

                    listadeprodutos.add(produto);

                    System.out.println("Digite 0 para sair ou 1 para continuar: ");
                    opcao = leitura.nextInt();

                } else {
                    opcao = 0;
                }
            }
            else{
                System.out.println("Opção inválida! Digite uma opção válida : ");
                opcao = leitura.nextInt();
            }
        }
        System.out.println("**********************************");
        System.out.println("COMPRA(s) REALIZADA(s) :");
        listadeprodutos.sort(Comparator.comparing(Produto::getPreco));
        System.out.println(listadeprodutos);
        System.out.println("***********************************");

        System.out.println("Saldo do cartão:" + cartaoAmanda.getSaldo());

    }
}