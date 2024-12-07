import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
       while (true) {
            System.out.print("Masukkan angka: ");
            int angka = input.nextInt();
            data.add(angka);

            System.out.print("Masukkan lagi? (Y/T): ");
            String pilihan = input.next();
            if (pilihan.equalsIgnoreCase("T")) {
                break;
            }
        }

        int nilaiMinimal = hitungMinimal();
        int nilaiMaksimal = hitungMaksimal();
        double nilaiRataRata = hitungRataRata();

        System.out.println("Nilai minimal : " + nilaiMinimal);
        System.out.println("Nilai maksimal : " + nilaiMaksimal);
        System.out.println("Nilai rata-rata : " + nilaiRataRata);
        
        System.out.println(Hitung.class.getDeclaredMethods().length);
        System.out.println(Hitung.class.getDeclaredFields().length);
    }
    public static int hitungMinimal() {
        int min = data.get(0);
        for (int angka : data) {
            if (angka < min) {
                min = angka;
            }
        }
        return min;
    }

    // Fungsi untuk menghitung nilai maksimal
    public static int hitungMaksimal() {
        int max = data.get(0);
        for (int angka : data) {
            if (angka > max) {
                max = angka;
            }
        }
        return max;
    }

    // Fungsi untuk menghitung nilai rata-rata
    public static double hitungRataRata() {
        int total = 0;
        for (int angka : data) {
            total += angka;
        }
        return (double) total / data.size();
    }
}
}
