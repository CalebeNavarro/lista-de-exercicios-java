import java.util.Scanner;

class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double hourValue = input.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double hoursWorked = input.nextDouble();

        double salary = hourValue * hoursWorked;
        System.out.println("O seu salário é: " + salary);

        input.close();
    }
}