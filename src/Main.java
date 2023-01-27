import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi , sayac= 0,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı gir :");
        sayi = input.nextInt();
        while (sayi!=0){
            toplam +=(sayi%10);
            sayi /=10;
            sayac++;
        }
        System.out.println("Basamaklarındaki sayılar toplamı : "+toplam);
    }
}
