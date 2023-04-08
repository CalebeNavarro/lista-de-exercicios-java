import java.util.Scanner;

class SalaryCalculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da sua hora de trabalho: ");
        double hourValue = input.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        double hoursWorked = input.nextDouble();

        double salary = hourValue * hoursWorked;
        double ir = salary * 0.11;
        double inss = salary * 0.08;
        double syndicate = salary * 0.05;
        double netSalary = salary - ir - inss - syndicate;

        System.out.println("O salário bruto é: " + salary);
        System.out.println("O valor pago ao INSS é: " + inss);
        System.out.println("O valor pago ao sindicato é: " + syndicate);
        System.out.println("O salário líquido é: " + netSalary);

        input.close();
    }
}