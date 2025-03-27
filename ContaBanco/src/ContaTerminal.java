import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o Número da Conta!");
        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o Número da Agência!");
        System.out.print("Agência: ");
        String agencia = sc.next();

        System.out.println("Por favor, digite o Nome do Cliente!");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Por favor, digite o valor Inicial do Saldo!");
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}