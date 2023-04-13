import java.util.Scanner;

public class DesafioBanco {
    public static void main(String[] args) {
        String nomeCliente = "João Victor";
        String tipoConta = "Corrente";
        double saldo = 0;
        int opcao = 0;
        /*String tipoConta;
        String nomeCliente;
        System.out.print("Informe seu nome completo: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Informe o tipo de conta que deseja abrir: (Poupança | Corrente) ");
        tipoConta = scanner.nextLine();*/

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

        while (opcao != 4){
            System.out.print(menuOpcoes);
            opcao = scanner.nextInt();

        if (opcao == 1){
            System.out.println("Seus saldo atual é: R$" + saldo);
        } else if (opcao == 2){
            System.out.println("Informe o valor que deseja transferir: ");
            double valor = scanner.nextDouble();
            if (valor > saldo) {
                System.out.println("Você não tem saldo suficiente para transferir esse valor!");

            } else {
                saldo = saldo - valor;
                System.out.println("Saldo atualizado: R$" + saldo);
            }
            } else if (opcao == 3) {
                System.out.println("Informe o valor que vai receber: ");
                double receberValor = scanner.nextDouble();
                saldo = receberValor + saldo;
                System.out.println("Saldo atualizado: R$" + saldo);

            } else if (opcao != 4) {
            System.out.println(menuOpcoes);
        }

        }


    }
}