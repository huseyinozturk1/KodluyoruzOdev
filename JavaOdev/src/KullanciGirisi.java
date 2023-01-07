/*Ödev:
-Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak
isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
yazan programı yazınız.*/

import java.util.Scanner;

public class KullanciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String usurName, password, pick;

        System.out.print("Kullanıcı Adını Giriniz: ");
        usurName = inp.nextLine();

        System.out.print("Şifrenizi Giriniz: ");
        password = inp.nextLine();

        if (usurName.equals("patika") && password.equals("java123")) {
            System.out.println("Başarılı Giriş Yaptınız!! ");
        } else {
            System.out.println("Şifreniz Yanlış Tekrar Deneyin!!\nŞifrenizi değiştirmek ister misiniz ?");


            pick = inp.nextLine();
            if (pick.equals("Yes") || pick.equals("yes")) {

                System.out.print("Yeni Şifrenizi Giriniz: ");
                password = inp.nextLine();
                if (password.equals("java123")) {
                    System.out.println("Yeni şifreniz ile eski şifreniz aynı olamaz!\n Tekrar Deneyin: ");
                    password = inp.nextLine();
                } else {
                    System.out.println("Şifreniz Başarıyla Değiştirildi!!!");
                }
            }

        }
    }
}
