import java.util.Scanner;

class LojaDeTintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o tamanho da área a ser pintada em metros quadrados: ");
        double area = input.nextDouble();

        double liters = area / 6.0;

        double paintCans = Math.ceil(liters / 18.0);
      
        double priceCans = paintCans * 80.0;

        System.out.println("Você precisará de " + paintCans + " lata(s) de 18 litros de tinta, ao custo total de R$ " + priceCans);

        double gallonsPaint = Math.ceil(liters / 3.6);

        double priceGallons = gallonsPaint * 25.0;

        System.out.println("Você precisará de " + gallonsPaint + " galão(ões) de 3,6 litro(s) de tinta, ao custo total de R$ " + priceGallons);


        double litersSlack = (area / 6.0) * 1.1;

        double mixedPaintCans = Math.floor(litersSlack / 18.0);

        double restOfLiters = litersSlack % 18.0;

        double mixedGallonsOfPaint = Math.ceil(restOfLiters / 3.6);

        double totalPrice = (mixedPaintCans * 80.0) + (mixedGallonsOfPaint * 25.0);

        System.out.printf("Você precisará de " + mixedPaintCans + " lata(s) de 18 litros e " + mixedGallonsOfPaint + " galão(ões) de 3,6 litro(s) de tinta, ao custo total de R$ " + totalPrice);

        input.close();
    }
}