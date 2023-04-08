import java.util.Scanner;

class ConvertMetersToCentimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros: ");
        double meters = input.nextDouble();

        double centimeters = meters * 100;

        System.out.println("A quantidade em centímetros é: " + centimeters);

        input.close();
    }
}