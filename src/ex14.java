import java.util.Scanner;

class FisherCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o peso dos peixes: ");
        double fishWeight = input.nextDouble();

        double excess = fishWeight - 50;
        double fine = excess * 4;

        System.out.println("O excesso é: " + excess);
        System.out.println("A multa é: " + fine);

        input.close();
    }
}