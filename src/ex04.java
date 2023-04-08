import java.util.Scanner;

class InputNotesAndShowAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double note1 = input.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double note2 = input.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double note3 = input.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double note4 = input.nextDouble();

        double media = (note1 + note2 + note3 + note4) / 4;

        System.out.println("A média das notas é: " + media);

        input.close();
    }
}