import java.util.Scanner;

public class Gaji{
    public static int masaKerja;

    public static int gaji(int masaKerja){
    if (masaKerja<5) {
        return 5000000;
    } else if (masaKerja>=5&&masaKerja<=10) {
        return 7500000;
    } else 
    return 10000000;
    }

    public static int lembur(int masaKerja){
        if (masaKerja<5) {
            return 40000;
        } else if (masaKerja>=5&&masaKerja<=10) {
            return 50000;
        } else 
        return 75000;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */

        int gajiBulanan = gaji(masaKerja);
        int lemburBulanan = lembur(masaKerja);

        lemburBulanan*=jamLembur;
        gajiBulanan+=lemburBulanan;

        System.out.println(gajiBulanan);
        
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
        input.close();
    }
    
}
