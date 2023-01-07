import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        double artik,artik1;

        System.out.print("Yılı Giriniz: ");
        yil = input.nextInt();

        artik = yil%4;
        artik1 = (yil%100 == 0) ? artik = yil % 400  : 0;
        if (artik==0){

            System.out.print(yil +" bir artık yıldır.");
        }else {
            System.out.print(yil+" bir artık yıl değildir.");
        }

    }
}
