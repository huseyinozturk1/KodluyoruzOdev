import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        int not=0,bolum=0;
        double ortalama;

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik=input.nextInt();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce=input.nextInt();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya=input.nextInt();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik=input.nextInt();


            if (mat>0 && mat<100 ){
            not += mat;
            bolum++;}

             if (fizik>0 && fizik<100 ){
            not += fizik;
            bolum++;}

            if (turkce>0 && turkce<100 ){
            not += turkce;
            bolum++;}

             if (kimya>0 && kimya<100 ){
            not += kimya;
            bolum++;}

            if (muzik>0 && muzik<100 ){
            not += muzik;
            bolum++;
            }

        ortalama = not/bolum;

                if (ortalama>=55){
                    System.out.println("Tebrikler Sınıfı Basarıyla Geçtiniz !!");
                }else {
                    System.out.println("Sınıfta Kaldınız!!!");
                }
        System.out.print("Not Ortalamanız: "+ ortalama);
    }
}
