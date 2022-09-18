import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe Scanner
        //TODO: Exibir as mensagens para o nosso usuário 
        //TODO: Obter pela scanner os valores digitados no terminal
        //TODO: Exibir a mensagem conta criada

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scan.nextLine();
        System.out.println();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scan.nextInt();
        System.out.println();

        System.out.println("Por favor, digite o nome do Cliente!");
        scan.nextLine();
        String nomeCliente = scan.nextLine();
        System.out.println();

        System.out.println("Por favor, digite o saldo da conta!");
        System.out.println();
        double saldo = scan.nextDouble();
        System.out.println();
        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scan.close();
    }
}
