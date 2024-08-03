import java.util.Scanner;

public class PresentaseNilai {
    public static byte menuUtama(){
        Scanner input = new Scanner(System.in);

        System.out.println("MENU UTAMA");
        System.out.println("1. Input Data Nilai Mahasiswa");
        System.out.println("2. Data Nilai Akhir dan Nilai Huruf Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Masukkan No Pilihan Anda (1/2/3) : ");
        byte pilihan = input.nextByte();
        return pilihan;
    }

    public static int inputNilai(){
        Scanner input = new Scanner(System.in);
        int nilaiTugas = 0,nilaiUts = 0, nilaiUas = 0;

        System.out.print("      Nilai Tugas   : ");
        nilaiTugas = input.nextInt();
        System.out.print("      Nilai UTS     : ");
        nilaiUts = input.nextInt();
        System.out.print("      Nilai UAS     : ");
        nilaiUas = input.nextInt();

        double presentaseNilaiAkhir = (0.4*nilaiTugas) + (0.2*nilaiUts) + (0.3*nilaiUas);
        int konvertNilaiAkhir = (int) presentaseNilaiAkhir;
        return konvertNilaiAkhir;
    }

    //Nilai huruf
    public static String nilaiHuruf(int nilaiAkhir){
        String result;

        if (nilaiAkhir >= 80 &&nilaiAkhir <= 100){
            result ="A";
        } else if (nilaiAkhir >= 75 && nilaiAkhir <= 79) {
            result ="AB";
        } else if (nilaiAkhir >= 65 && nilaiAkhir <= 74) {
            result ="B";
        } else if (nilaiAkhir <= 64 && nilaiAkhir >= 60) {
            result ="BC";
        } else if (nilaiAkhir <= 59 && nilaiAkhir >= 56) {
            result ="C";
        }else if (nilaiAkhir <= 55 && nilaiAkhir >= 45) {
            result ="D";
        }else if (nilaiAkhir <= 44 && nilaiAkhir >= 0) {
            result ="E";
        }else {
            result =  "Maaf, nilai anda di bawah nol";
        }
        return result;
    }
}
