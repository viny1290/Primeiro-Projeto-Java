import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        String nome = "Vinicius";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        boolean sair = true;

        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor 
                4 - Sair

                """;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("\n***********************");

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
            double valorTransferencia = 0;

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo Atual é de: " + saldo);
                    break;
                case 2:
                    System.out.println("Qual o valor que vocÊ deseja transferir: ");
                    valorTransferencia = leitura.nextDouble();
                    
                    if(valorTransferencia <= saldo)
                    {
                        saldo -= valorTransferencia;
                        System.out.println("Seu saldo atual ficou: " + saldo);
                    }
                    else
                    {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Qual o valor que vocÊ deseja Receber: ");
                    valorTransferencia = leitura.nextDouble();
                    
                    saldo += valorTransferencia;
                    System.out.println("Seu saldo atual ficou: " + saldo);
                    break;
                case 4:
                    System.out.println("Saindo.....");
                    break;
            
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
