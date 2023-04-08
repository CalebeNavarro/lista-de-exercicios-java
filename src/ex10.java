import java.util.Scanner;

class CelsiusToFahrenheitConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        input.close();
    }
}