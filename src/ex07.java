import java.util.Scanner;

class SquareAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da área do quadrado: ");
        double side = input.nextDouble();

        double doubleArea = (side * side) * 2;
        System.out.println("A área do quadrado é: " + doubleArea);

        input.close();
    }
}