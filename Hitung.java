import java.util.Scanner;
import java.util.ArrayList;

public class Hitung{

    public static ArrayList<Integer> data = new ArrayList<>();

    public static double rataRata(ArrayList<Integer>data){
        double total = 0;
        for (int i = 0; i < data.size(); i++) {
                total += data.get(i);
            }
        double rata = total / data.size();
        return rata;
    }

    public static int nilaiMin (ArrayList<Integer>data){
        int min = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
                }
                }
                return min;
    }
    
    public static int nilaiMax (ArrayList<Integer>data){
        int max = data.get(0);
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) > max) {
                max = data.get(i);
                }
                }
                return max;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /* Pekerjaan anda mulai dari sini */

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

        /* Pekerjaan anda berakhir sini */

        input.close();
    }
}
