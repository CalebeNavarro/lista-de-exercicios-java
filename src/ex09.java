import java.util.Scanner;

class FahrenheitToCelsiusConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("A temperatura em Celsius é: " + celsius);

        input.close();
    }
}