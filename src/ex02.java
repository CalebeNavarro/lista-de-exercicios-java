import java.util.Scanner;
class ShowTheInputNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        System.out.println("O número informado foi: " + numero);
        
        input.close();
    }
}