import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dy;
        System.out.print("Doğum Tarihinizi Giriniz: ");
        dy = input.nextInt();

        dy= dy%12;

        switch (dy){

            case 0:
                System.out.print("Çin Zodyağı Burcunuz: Maymun");
            break;

            case 1:
                System.out.print("Çin Zodyağı Burcunuz: Horoz");
            break;

            case 2:
                System.out.print("Çin Zodyağı Burcunuz: Köpek");
            break;

            case 3:
                System.out.print("Çin Zodyağı Burcunuz: Domuz");
            break;

            case 4:
                System.out.print("Çin Zodyağı Burcunuz: Fare");
            break;

            case 5:
                System.out.print("Çin Zodyağı Burcunuz: Öküz");
            break;

            case 6:
                System.out.print("Çin Zodyağı Burcunuz: Kaplan");
            break;

            case 7:
                System.out.print("Çin Zodyağı Burcunuz: Tavşan");
            break;

            case 8:
                System.out.print("Çin Zodyağı Burcunuz: Ejderha");
            break;

            case 9:
                System.out.print("Çin Zodyağı Burcunuz: Yılan");
            break;

            case 10:
                System.out.print("Çin Zodyağı Burcunuz: At");
            break;

            default:
                System.out.print("Çin Zodyağı Burcunuz: Koyun");






        }
    }
}
