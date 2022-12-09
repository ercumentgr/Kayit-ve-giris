import java.util.Scanner;

//kayıt ve giriş programı
public class Main {
    public static void main(String[] args) {
        System.out.println("...Hoşgeldiniz...");
        Scanner bilgi=new Scanner(System.in);
        System.out.println("Kullanıcı Adı Giriniz:");
        String kullanıcıadı=bilgi.next();
        System.out.println("Şifre Giriniz:(SADECE SAYILARDAN OLUŞMALI)");
        String sifre=bilgi.next();
        System.out.println("--------------------------------");
        System.out.println("Başarıyla Kaydınız Oluşturuldu.");
        System.out.println("--------------------------------");
        System.out.println("Giriş Yapınız");
        while (true){
            Scanner girdi=new Scanner(System.in);
            System.out.println("Kullanıcı Adı Giriniz:");
            String ka= girdi.next();
            System.out.println("Şifre Giriniz:");
            String pas= girdi.next();
            if ((kullanıcıadı.equals(ka)) && (sifre.equals(pas))){
                System.out.println("Giriş Başarılı.");
                System.out.println("Hoşgeldiniz "+ka);
                break;
            }
            else if ((sifre.equals(pas))) {
                System.out.println("Kullanıcı Adınız Hatalı!");

            } else {
                System.out.println("Hatalı Giriş Yaptınız!");

            }
        }
    }
}