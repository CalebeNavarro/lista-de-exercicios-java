import java.util.Scanner;

class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        double radius = input.nextDouble();
        
        double pi = 3.141;
        double area = pi * (radius * radius);
        System.out.println("A área do círculo é: " + area);

        input.close();
    }
}