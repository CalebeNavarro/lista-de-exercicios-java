import java.util.Scanner;

class ManAndWomenWeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double height = input.nextDouble();

        double weightForMen = (72.7 * height) - 58;
        double weightForWomen = (62.1 * height) - 44.7;

        System.out.println("O seu peso ideal é: " + weightForMen + " para homens");
        System.out.println("O seu peso ideal é: " + weightForWomen + " para mulheres");

        input.close();
    }
}