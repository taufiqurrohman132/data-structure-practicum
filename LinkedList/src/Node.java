import java.util.Scanner;

class Node {
    String data;
    Node berikutnya;

    public Node(String data) {
        this.data = data;
        this.berikutnya = null;
    }
}

class LinkedList {
    private Node induk;

    // Tambah data di awal
    public void tambahAwal(String data) {
        Node nodeBaru = new Node(data);
        nodeBaru.berikutnya = induk;
        induk = nodeBaru;
    }

    // Tambah data di akhir
    public void tambahAkhir(String data) {
        Node nodeBaru = new Node(data);
        if (induk == null) {
            induk = nodeBaru;
        } else {
            Node saatIni = induk;
            while (saatIni.berikutnya != null) {
                saatIni = saatIni.berikutnya;
            }
            saatIni.berikutnya = nodeBaru;
        }
    }

    // Tambah data pada posisi tertentu
    public void tambahPadaPosisi(String data, int posisi) {
        Node nodeBaru = new Node(data);
        if (posisi == 1) {
            tambahAwal(data);
        } else {
            Node saatIni = induk;
            int hitungan = 1;
            while (saatIni != null && hitungan < posisi - 1) {
                saatIni = saatIni.berikutnya;
                hitungan++;
            }
            if (saatIni == null) {
                System.out.println("Posisi tidak ditemukan");
            } else {
                nodeBaru.berikutnya = saatIni.berikutnya;
                saatIni.berikutnya = nodeBaru;
            }
        }
    }

    // Hapus data di awal
    public void hapusAwal() {
        if (induk == null) {
            System.out.println("List kosong");
        } else {
            induk = induk.berikutnya;
        }
    }

    // Hapus data di akhir
    public void hapusAkhir() {
        if (induk == null) {
            System.out.println("List kosong");
        } else if (induk.berikutnya == null) {
            induk = null;
        } else {
            Node saatIni = induk;
            while (saatIni.berikutnya.berikutnya != null) {
                saatIni = saatIni.berikutnya;
            }
            saatIni.berikutnya = null;
        }
    }

    // Hapus data pada posisi tertentu
    public void hapusPadaPosisi(int posisi) {
        if (induk == null) {
            System.out.println("List kosong");
        } else if (posisi == 1) {
            hapusAwal();
        } else {
            Node saatIni = induk;
            int hitungan = 1;
            while (saatIni != null && hitungan < posisi - 1) {
                saatIni = saatIni.berikutnya;
                hitungan++;
            }
            if (saatIni == null || saatIni.berikutnya == null) {
                System.out.println("Posisi tidak ditemukan");
            } else {
                saatIni.berikutnya = saatIni.berikutnya.berikutnya;
            }
        }
    }

    // Cari data
    public boolean cari(String data) {
        Node saatIni = induk;
        while (saatIni != null) {
            if (saatIni.data.equals(data)) {
                return true;
            }
            saatIni = saatIni.berikutnya;
        }
        return false;
    }

    // Tampilkan data
    public void tampilkan() {
        if (induk == null) {
            System.out.println("List kosong");
        } else {
            Node saatIni = induk;
            int i = 1;
            int k = 1;
            System.out.println("====================================================================");
            System.out.println("Data dalam list: ");
            System.out.println("====================================================================");
            while (saatIni != null) {
                int jumlahData = saatIni.data.length();
                int panjangSpasi = 15;
                panjangSpasi -= jumlahData;
                System.out.print("| "+saatIni.data );
                for (int j = 0; j < panjangSpasi; j++) {
                    System.out.print(" " );
                }
                if (i == k*4){
                    System.out.print("|\n" );
                    k++;
                }
                saatIni = saatIni.berikutnya;
                i++;
            }
            System.out.println();
        }
    }
}

class App {
    public static void main(String[] args) {
        LinkedList daftar = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=======================");
            System.out.println("        MENU");
            System.out.println("=======================");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data pada node tertentu");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Hapus data pada node tertentu");
            System.out.println("7. Cari data");
            System.out.println("8. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            System.out.println("======================" );

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    String dataAwal = scanner.nextLine();
                    daftar.tambahAwal(dataAwal);
                    daftar.tampilkan();
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    String dataAkhir = scanner.nextLine();
                    daftar.tambahAkhir(dataAkhir);
                    daftar.tampilkan();
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    String dataTengah = scanner.nextLine();
                    System.out.print("Masukkan posisi: ");
                    int posisiTambah = scanner.nextInt();
                    daftar.tambahPadaPosisi(dataTengah, posisiTambah);
                    daftar.tampilkan();
                    break;
                case 4:
                    daftar.hapusAwal();
                    daftar.tampilkan();
                    break;
                case 5:
                    daftar.hapusAkhir();
                    daftar.tampilkan();
                    break;
                case 6:
                    System.out.print("Masukkan posisi: ");
                    int posisiHapus = scanner.nextInt();
                    daftar.hapusPadaPosisi(posisiHapus);
                    daftar.tampilkan();
                    break;
                case 7:
                    System.out.print("Masukkan data yang dicari: ");
                    String cariData = scanner.nextLine();
                    boolean ditemukan = daftar.cari(cariData);
                    if (ditemukan) {
                        System.out.println(">>Data ditemukan");
                    } else {
                        System.out.println(">>Data tidak ditemukan");
                    }
                    break;
                case 8:
                    System.out.println(">>Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println(">>Pilihan tidak valid");
            }
        }
    }
}