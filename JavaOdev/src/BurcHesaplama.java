import java.util.Scanner;
     /*      Koç Burcu : 21 Mart - 20 Nisan
             Boğa Burcu : 21 Nisan - 21 Mayıs
             İkizler Burcu : 22 Mayıs - 22 Haziran
             Yengeç Burcu : 23 Haziran - 22 Temmuz
             Aslan Burcu : 23 Temmuz - 22 Ağustos
             Başak Burcu : 23 Ağustos - 22 Eylül
             Terazi Burcu : 23 Eylül - 22 Ekim
             Akrep Burcu : 23 Ekim - 21 Kasım
             Yay Burcu : 22 Kasım - 21 Aralık
             Oğlak Burcu : 22 Aralık - 21 Ocak
             Kova Burcu : 22 Ocak - 19 Şubat
             Balık Burcu : 20 Şubat - 20 Mart*/
        public class BurcHesaplama {
         public static void main(String[] args) {
             Scanner input = new Scanner(System.in);
             int day, mounth;

             System.out.print("Doğduğunuz Gün: ");
             day = input.nextInt();
             System.out.print("Doğduğunuz Ay: ");
             mounth = input.nextInt();
             if ((day<=0) || (day>31) || (mounth<=0) || (mounth>12)) {
                 System.out.println("Hatalı Giriş Yaptınız!!!");
             }else if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
                 System.out.println("Oglak Burcu");
             } else if ((mounth == 1) && (day >= 22) || ((mounth == 2) && (day <= 19))) {
                 System.out.println("Kova Burcu");
             } else if ((mounth == 2) && (day >= 20) || ((mounth == 3) && (day <= 20))) {
                 System.out.println("Balik Burcu");
             } else if ((mounth == 3) && (day >= 21) || ((mounth == 4) && (day <= 20))) {
                 System.out.println("Koc Burcu");
             } else if ((mounth == 4) && (day >= 21) || ((mounth == 5) && (day <= 21))) {
                 System.out.println("Boga Burcu");
             } else if ((mounth == 5) && (day >= 22) || ((mounth == 6) && (day <= 22))) {
                 System.out.println("Ikizler Burcu");
             } else if ((mounth == 6) && (day >= 23) || ((mounth == 7) && (day <= 22))) {
                 System.out.println("Yengec Burcu");
             } else if ((mounth == 7) && (day >= 23) || ((mounth == 8) && (day <= 22))) {
                 System.out.println("Aslan Burcu");
             } else if ((mounth == 8) && (day >= 23) || ((mounth == 9) && (day <= 22))) {
                 System.out.println("Basak Burcu");
             } else if ((mounth == 9) && (day >= 23) || ((mounth == 10) && (day <= 22))) {
                 System.out.println("Terazi Burcu");
             } else if ((mounth == 10) && (day >= 23) || ((mounth == 11) && (day <= 21))) {
                 System.out.println("Akrep Burcu");
             } else if ((mounth == 11) && (day >= 22) || ((mounth == 12) && (day <= 21))) {
                 System.out.println("Yay Burcu");
             } else if ((mounth == 12) && (day >= 22) || ((mounth == 1) && (day <= 21))) {
                 System.out.println("Oglak Burcu");


                 }
             }
         }
