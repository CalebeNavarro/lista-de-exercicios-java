import java.util.Scanner;

class PrintTheSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number1 = input.nextInt();

        System.out.println("Digite o seugndo número: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        System.out.println("A soma dos números é: " + sum);

        input.close();
    }
}
