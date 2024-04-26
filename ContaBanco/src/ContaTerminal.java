import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência!");
        numero = leia.nextInt();
        leia.nextLine();
        System.out.println("Digite a agência: ");
        agencia = leia.nextLine();
        System.out.println("Digite o nome do cliente: ");
        nomeCliente = leia.nextLine();
        System.out.println("Digite o saldo: ");
        saldo = Double.parseDouble(leia.nextLine());

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é "+ agencia + ", conta "+ numero + " e seu saldo "+ saldo +
                " já está disponível para saque");

        leia.close();
    }
}