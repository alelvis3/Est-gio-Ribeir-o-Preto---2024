import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Número a ser verificado
        System.out.print("Informe um número para verificar se pertence à sequência de Fibonacci: ");
        int numeroInformado = scanner.nextInt();

        if (isFibonacciNumber(numeroInformado)) {
            System.out.println(numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacciNumber(int number) {
        int a = 0, b = 1;
        while (a <= number) {
            if (a == number) {
                return true;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        return false;
    }
}
