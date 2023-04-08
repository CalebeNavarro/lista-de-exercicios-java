import java.util.Scanner;

class DownloadCalculutaor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho do arquivo em MB: ");
        double fileSize = input.nextDouble();

        System.out.print("Digite a velocidade da internet em Mbps: ");
        double internetSpeed = input.nextDouble();

        double downloadTime = fileSize / internetSpeed;

        System.out.println("O tempo aproximado de download do arquivo usando esse link é de " + downloadTime + " minutos");

        input.close();
    }
}