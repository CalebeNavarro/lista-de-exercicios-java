import java.util.Scanner;

class InputNumbersToBeConverted {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int number1 = input.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int number2 = input.nextInt();

        System.out.println("Digite um número real: ");
        double number3 = input.nextDouble();

        double product = (number1 * 2) * (number2 / 2);
        double sum = (number1 * 3) + number3;
        double cube = Math.pow(number3, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo é: " + product);
        System.out.println("A soma do triplo do primeiro com o terceiro é: " + sum);
        System.out.println("O terceiro elevado ao cubo é: " + cube);

        input.close();
    }
}