import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

       //değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;
        //scanner sınıfını tanımladık
        Scanner input = new Scanner(System.in);

        //kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Turkce Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih  = input.nextInt();

        System.out.print("Muzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam/6;
        System.out.println("Ortalamaniz: " + ortalama);
        String durum = ortalama >=60 ? "Sinifi Gectin" : "Sinifta Kaldin";
        System.out.println(durum);








    }
}
