import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);//khusus string
        Scanner inputNumber = new Scanner(System.in);//khusus number

        System.out.println("===========================================================");
        System.out.println("              PROGRAM PENILAIAN MAHASISWA");
        System.out.println("===========================================================");

        String[] DataHasil;//Array untuk mengisi data
        ArrayList<String> data = new ArrayList<>();//arraylist untuk menyimpan data

        int nomorData = 1;
        while (nomorData != 0){
            byte menuUtama = PresentaseNilai.menuUtama();//menu utama
            System.out.println();

            int inputNilai;
            byte jumlahData;
            String nilaiHuruf, nama , nim, namaMK, konvertNilaiAngka;

            switch (menuUtama){
                case 1 :
                    System.out.println("===========================================================");
                    System.out.println("              INPUT DATA NILAI MAHASISWA");
                    System.out.println("===========================================================");
                    System.out.print("Banyak Data : ");
                    jumlahData = inputNumber.nextByte();
                    DataHasil = new String[jumlahData];

                    for (byte i = 0; i < jumlahData; i++) {

                        System.out.print(nomorData+".");
                        System.out.print("    NIM           : ");
                        nim = inputString.nextLine();
                        System.out.print("      Nama          : ");
                        nama = inputString.nextLine();
                        System.out.print("      Nama MK       : ");
                        namaMK = inputString.nextLine();

                        inputNilai = PresentaseNilai.inputNilai();
                        nilaiHuruf = PresentaseNilai.nilaiHuruf(inputNilai);
                        konvertNilaiAngka = String.valueOf(inputNilai);//konversi dari integer ke string

                        DataHasil[i] = (nomorData)
                                +" .   NIM             : "+nim.toUpperCase()+"\n"
                                +"      Nama            : "+nama.toUpperCase()+"\n"
                                +"      Nama MK         : "+namaMK.toUpperCase()+"\n"
                                +"      Nilai Akhir     : "+konvertNilaiAngka+"\n"
                                +"      Nilai Huruf     : "+nilaiHuruf;

                        System.out.println("-----------------------------------------------------------");

                        nomorData++;
                    }

                    //MENU SAVE
                    boolean running = true;
                    while (running){
                        System.out.print("Save (Y/T) : ");
                        String save = inputString.nextLine();
                        char expeted = 'y';
                        char expetedFalse = 't';

                        if (save.length() != 1) {
                           System.out.println("Jawaban Anda Tidak Valid!!");
                        } else {
                            char inputNotSave = save.charAt(0);
                            char inputSave = save.charAt(0);
                            //ketika di save
                            if (inputSave == expeted){
                                System.out.println("Tersimpan...");
                                System.out.println();

                                for (String dataBase : DataHasil){
                                    data.add(dataBase+"\n");
                                }
                                running= false;
                            //ketika tidak disave
                            } else if (inputNotSave == expetedFalse) {
                                System.out.println("Tidak Disimpan...");
                                nomorData = nomorData - (nomorData -1);
                                System.out.println();
                                running = false;
                            } else {
                                System.out.println("Jawaban Anda Tidak Valid!!");
                                System.out.println("Silahkan Masukkan Ulang!");
                            }
                        }
                        System.out.println("===========================================================");
                        System.out.println();
                    }
                    break;
                case 2:
                    if (data.isEmpty()) {
                        System.out.println("---------Mohon Lengkapi Data Anda!!---------");
                        System.out.println();
                    } else {
                        System.out.println("===========================================================");
                        System.out.println("              DATA NILAI MAHASISWA");
                        System.out.println("===========================================================");

                        for (int i = 0; i < data.size() ; i++) {
                            System.out.println(data.get(i)+"\n-----------------------------------------------------------");
                        }
                        System.out.println("-----------------------------------------------------------");
                        System.out.println("===========================================================");
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Anda Keluar");
                    nomorData = 0;
                    inputString.close();
                    inputNumber.close();
                    break;
                default:
                    System.out.println("Pilihan Yang Anda Masukkan Tidak Valid!!");
            }
        }
        inputNumber.close();
        inputString.close();
    }
}
