//Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58

import java.util.Scanner;

class WeightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        double height = input.nextDouble();

        double weight = (72.7 * height) - 58;
        System.out.println("O seu peso ideal é: " + weight);

        input.close();
    }
}