import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Peter Parker";
        String tipoConta = "Conta Corrente";
        double saldo = 1000;
        double limite = 1000;
        boolean status = true;
        int opcao=0;

        System.out.println("*****************************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("Status: " + status);
        System.out.println("*****************************");

        String menu = """
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                
                """;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if(opcao == 1){
                System.out.println("O saldo é: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor a ser transferido: ");
                double valor = scanner.nextDouble();
                if (valor > saldo) {
                    System.out.println("Saldo insuficiente!");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }
        }
    }
}
