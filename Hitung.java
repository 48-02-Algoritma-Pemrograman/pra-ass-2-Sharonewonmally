import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String jawab;

        do {
            data.add(input.nextInt());

            jawab = input.next().trim().toUpperCase();
            while (!jawab.equals("Y") && !jawab.equals("T")) {
                jawab = input.next().trim().toUpperCase();
            }
        } while (jawab.equals("Y"));

        System.out.println("Nilai minimal : "+ nilaiMin(data));
        System.out.println("Nilai maksimal : "+ nilaiMax(data));
        System.out.println("Nilai rata-rata : "+ rataRata(data));
        System.out.println(Hitung.class.getDeclaredMethods().length);
        System.out.println(Hitung.class.getDeclaredFields().length);
    }
}
