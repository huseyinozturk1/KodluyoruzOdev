import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mesafe,yas,yolculuktipi;
        double tutar,indirimlitutar,ttutar;

        System.out.print("Lütfen Mesafenizi Giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = input.nextInt();
        System.out.print("Lütfen Yolculuk Tipini Seçiniz (1-> Gidiş ,2-> Gidiş Dönüş): ");
        yolculuktipi = input.nextInt();

        tutar = mesafe * 0.10;

        if ((mesafe<0) || (yas<0) || (yolculuktipi<1) || (yolculuktipi>2)){
            System.out.println("Hatalı Veri Girdiniz.");
        } else if ((yas <= 12) && (yolculuktipi== 1)) {
            tutar -= tutar * 0.5 ;
            System.out.print("Tutarınız : "+ tutar + " Tl");
        } else if ((yas <= 12) && (yolculuktipi== 2)) {
            tutar -= (tutar * 0.5);
            indirimlitutar = tutar-tutar*0.2;
            ttutar = indirimlitutar*2;
            System.out.println("Tutarınız: "+ ttutar + " Tl");
        }else if ((yas > 12 && yas <=24) && (yolculuktipi==1)) {
            tutar -= tutar * 0.1;
            System.out.print("Tutarınız: "+ tutar + " Tl");
        }else if ((yas > 12 && yas <=24) && (yolculuktipi==2)) {
            tutar -= (tutar * 0.1);
            indirimlitutar = tutar-tutar*0.2;
            ttutar = indirimlitutar*2;
            System.out.print("Tutarınız: "+ ttutar + " Tl");
        }else if ((yas >= 65) && (yolculuktipi==1)) {
            tutar -= tutar * 0.3;
            System.out.print("Tutarınız: " + tutar + " Tl");
        }else if ((yas >= 65) && (yolculuktipi==2)) {
            tutar -= (tutar * 0.3);
            indirimlitutar = tutar-tutar*0.2;
            ttutar = indirimlitutar*2;
            System.out.print("Tutarınız: " + ttutar + " Tl");
        }else {
            if (yolculuktipi==1){
                tutar = mesafe * 0.10;
                System.out.print("Tutarınız: " + tutar + " Tl" );
            }else {
                tutar = mesafe * 0.10;
                tutar += tutar*0.2;
                System.out.print("Tutarınız: " + tutar + " Tl");
            }
        }

    }
}
