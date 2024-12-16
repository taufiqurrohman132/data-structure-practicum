import java.util.Scanner;

public class PemesananTiket {
    static Scanner input = new Scanner(System.in);
    static String[] kursi = new String[20];
    static String kosong = "Kosong";
    static String terisi = "TERISI";
    public static void main(String[] args) {
        for (int j = 0; j < kursi.length; j++) {
            kursi[j] = kosong;
        }
        boolean bool = true;
        while (bool){
        menuPemesanan();
        int number = input.nextInt();
            switch (number){
                case 1:
                    statusKursi();
                    break;
                case 2:
                    boolean ulang = true;
                    while (ulang){
                        System.out.print("Masukkan nomor kursi yang ingin di pesan (1-20) : ");
                        int number2 = input.nextInt();
                        if (number2 > kursi.length){
                            System.out.println(">>>>>>>>Maaf, Nomor kursi tidak tersedia. Silahkan pilih yang lain!");
                            System.out.println();
                        }else {
                            if (kursi[number2-1] == terisi){
                                pesanKursi(number2);
                            }else if (kursi[number2-1] == kosong) {
                                pesanKursi(number2);
                                ulang = false;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Anda telah keluar!");
                    bool = false;
                    break;
                default:
                    System.out.println("Silahkan Masukkan Nomor Yang Sesuai!!");
            }
        }
    }

    private static void statusKursi(){
        for (int i = 0; i < kursi.length; i++) {
            String noKursi = kursi[i];
            if (noKursi == kosong) {
                System.out.println("Kursi "+(i+1)+" : "+ kosong);
            }else {
                System.out.println("Kursi "+(i+1)+" : "+ terisi);
            }
        }
    }

    private static void pesanKursi(int num){
            if (kursi[num-1] == kosong){
                kursi[num-1] = terisi;
                System.out.println("Kursi "+num+" BERHASIL dipesan.");
                System.out.println();
            }else if (kursi[num-1] == terisi) {
                System.out.println("Kursi sudah terisi. Silahkan pilih kursi lain!");
                System.out.println();
            }
    }

    private static void menuPemesanan(){
        System.out.println("===========================");
        System.out.println("    Pemesanan Tiket Bus"   );
        System.out.println("===========================");
        System.out.println("1. Lihat Status Kursi\n2. Pesan Kursi\n3. Keluar");
        System.out.print("Masukkan Pilihan : ");
    }
}
