import java.util.Scanner;

public class BancoJavaSwitch {
    public static void main(String[] args) {
        String mensagem;
        String nomeCliente = "João Victor";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;

        String perfilCliente = """
                ***********************
                Dados iniciais do cliente:

                Nome: %s
                Tipo conta: %s
                Saldo inicial: R$ %.2f
                ***********************
                """.formatted(nomeCliente, tipoConta, saldo);
        String menuOpcoes = """
                ** Digite sua opção **
                1- Consultar saldo
                2- Transferir valor
                3- Receber valor
                4- Sair

                Digite a opção desejada: 
                """;
        System.out.print(perfilCliente);

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.print(menuOpcoes);
            opcao = scanner.nextInt();

            switch(opcao) {
                case 1:
                    mensagem = "Seu saldo atual é: " + saldo;
                    System.out.println(mensagem);
                    break;
                case 2:
                    mensagem = "Informe o valor que deseja transferir: ";
                    System.out.println(mensagem);
                    double valor = scanner.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Você não tem saldo suficiente para transferir esse valor!");
                    } else {
                        saldo = saldo - valor;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }
                    break;
                case 3:
                    mensagem = "Informe o valor que vai receber: ";
                    System.out.println(mensagem);
                    double receberValor = scanner.nextDouble();
                    saldo = receberValor + saldo;
                    System.out.println("Saldo atualizado: R$" + saldo);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }

        System.out.println("Obrigado por utilizar nossos serviços!");
    }
}
