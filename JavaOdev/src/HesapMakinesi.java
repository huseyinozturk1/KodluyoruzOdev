import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {

        int n1,n2,select;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci Değerinizi Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Değeri Giriniz: ");
        n2 = input.nextInt();

        System.out.println("Yapacağınız işlemi giriniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiniz: ");
        select=input.nextInt();

        switch (select) {

            case 1:
                select = n1+n2;
                System.out.print("Sonucunuz: "+ select);
                break;
            case 2:
                select = n1-n2;
                System.out.print("Sonucunuz: "+ select);
                break;
            case 3:
                select = n1*n2;
                System.out.print("Sonucunuz: "+ select);
                break;
            case 4:
                if (n2 == 0){
                    System.out.print("Sayılar sıfıra bölünemez!!");
                }else {
                    select = n1/n2;
                    System.out.print("Sonucunuz: "+ select);
                }
                break;
            default:
                System.out.print("Yanlış tuşa bastınız!!!!\nTekrar Deneyiniz: ");
        }

    }
}
