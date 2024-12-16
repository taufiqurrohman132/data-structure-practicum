import java.util.LinkedList;
import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        int noMenu;

        do {
            System.out.println("===========================");
            System.out.println("            MENU:");
            System.out.println("===========================");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Tambah data pada node tertentu");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Hapus data pada node tertentu");
            System.out.println("7. Cari data");
            System.out.println("8. Keluar");
            System.out.println("Isi linked list: " + list);
            System.out.print("Masukkan pilihan: ");
            noMenu = scannerInt.nextInt();
            System.out.println("===========================");

            switch (noMenu) {
                case 1:
                    System.out.print("Masukkan data: ");
                    String dataDiAwal = scanner.nextLine();
                    list.addFirst(dataDiAwal);
                    System.out.println(">> "+ dataDiAwal + " ditambahkan di awal.");
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    String dataDiAkhir = scanner.nextLine();
                    list.addLast(dataDiAkhir);
                    System.out.println(">> "+ dataDiAkhir + " ditambahkan di akhir.");
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    String dataPadaPosisi = scanner.nextLine();
                    System.out.print("Masukkan posisi: ");
                    int position= scannerInt.nextInt();
                    position--;

                    if (position < 0 || position > list.size()) {
                        System.out.println("WARNING: Posisi tidak valid, tidak ada node yang ditambahkan.");
                    } else {
                        list.add(position, dataPadaPosisi);
                        System.out.println(">> "+ dataPadaPosisi + " ditambahkan pada posisi " + position+1 + ".");
                    }
                    break;
                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List kosong, tidak ada yang dihapus.");
                    } else {
                        System.out.println(">> "+list.removeFirst() + " dihapus dari awal.");
                    }
                    break;
                case 5:
                    if (list.isEmpty()) {
                        System.out.println("List kosong, tidak ada yang dihapus.");
                    } else {
                        System.out.println(">> "+list.removeLast() + " dihapus dari akhir.");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan posisi: ");
                    int deletePosition = scanner.nextInt();
                    deletePosition--;
                    if (deletePosition < 0 || deletePosition >= list.size()) {
                        System.out.println("Posisi tidak valid, tidak ada node yang dihapus.");
                    } else {
                        System.out.println(">> "+list.remove(deletePosition) + " dihapus dari posisi " + deletePosition+1 + ".");
                    }
                    break;
                case 7:
                    System.out.print("Masukkan data yang dicari: ");
                    String cariKey = scanner.nextLine();
                    if (list.contains(cariKey)) {
                        System.out.println(">> "+"Data " + cariKey + " ditemukan.");
                    } else {
                        System.out.println(">> "+"Data " + cariKey + " tidak ditemukan.");
                    }
                    break;
                case 8:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

            // Menampilkan isi linked list setelah setiap operasi
            System.out.println(">> "+"Isi linked list: " + list);

        } while (noMenu != 8);

        scanner.close();
    }
}


//import java.util.List;
//import java.util.Scanner;
//
//class Node {
//    String data;
//    Node next;
//    List <String>list = new java.util.LinkedList<>();
//
//    Node(String data) {
//        this.data = data;
//        this.next = null;
//        this.list.add(data);
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    // Tambah data di awal
//    public void insertAtBeginning(String data) {
//        Node newNode = new Node(data);
//        newNode.next = head;
//        head = newNode;
//        System.out.println(data + " ditambahkan di awal.");
//    }
//
//    // Tambah data di akhir
//    public void insertAtEnd(String data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//            System.out.println(data + " ditambahkan di akhir.");
//            return;
//        }
//        Node last = head;
//        while (last.next != null) {
//            last = last.next;
//        }
//        last.next = newNode;
//        System.out.println(data + " ditambahkan di akhir.");
//    }
//
//    // Tambah data pada node tertentu
//    public void insertAtPosition(String data, int position) {
//        Node newNode = new Node(data);
//        if (position == 0) {
//            insertAtBeginning(data);
//            return;
//        }
//        Node current = head;
//        for (int i = 0; i < position - 1 && current != null; i++) {
//            current = current.next;
//        }
//        if (current == null) {
//            System.out.println("Posisi tidak valid, tidak ada node yang ditambahkan.");
//            return;
//        }
//        newNode.next = current.next;
//        current.next = newNode;
//        System.out.println(data + " ditambahkan pada posisi " + position + ".");
//    }
//
//    // Hapus data di awal
//    public void deleteAtBeginning() {
//        if (head == null) {
//            System.out.println("List kosong, tidak ada yang dihapus.");
//            return;
//        }
//        System.out.println(head.data + " dihapus dari awal.");
//        head = head.next;
//    }
//
//    // Hapus data di akhir
//    public void deleteAtEnd() {
//        if (head == null) {
//            System.out.println("List kosong, tidak ada yang dihapus.");
//            return;
//        }
//        if (head.next == null) {
//            System.out.println(head.data + " dihapus dari akhir.");
//            head = null;
//            return;
//        }
//        Node secondLast = head;
//        while (secondLast.next.next != null) {
//            secondLast = secondLast.next;
//        }
//        System.out.println(secondLast.next.data + " dihapus dari akhir.");
//        secondLast.next = null;
//    }
//
//    // Hapus data pada node tertentu
//    public void deleteAtPosition(int position) {
//        if (head == null) {
//            System.out.println("List kosong, tidak ada yang dihapus.");
//            return;
//        }
//        if (position == 0) {
//            deleteAtBeginning();
//            return;
//        }
//        Node current = head;
//        for (int i = 0; i < position - 1 && current != null; i++) {
//            current = current.next;
//        }
//        if (current == null || current.next == null) {
//            System.out.println("Posisi tidak valid, tidak ada node yang dihapus.");
//            return;
//        }
//        System.out.println(current.next.data + " dihapus dari posisi " + position + ".");
//        current.next = current.next.next;
//    }
//
//    // Cari data
//    public void search(String key) {
//        Node current = head;
//        int position = 1;
//        while (current != null) {
//            if (current.list  key) {
//                System.out.println("Data " + key + " ditemukan pada posisi " + position + ".");
//                return;
//            }
//            current = current.next;
//            position++;
//        }
//        System.out.println("Data " + key + " tidak ditemukan.");
//    }
//
//    // Tampilkan isi linked list
//    public void display() {
//        if (head == null) {
//            System.out.println("List kosong.");
//            return;
//        }
//        Node current = head;
//        System.out.print("Isi linked list: ");
//        while (current != null) {
//            System.out.print(current.data + " ");
//            current = current.next;
//        }
//        System.out.println();
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Scanner scannerString = new Scanner(System.in);
//        List<String> list = new java.util.LinkedList<>();
//        int choice;
//
//        do {
//            System.out.println("MENU:");
//            System.out.println("1. Tambah data di awal");
//            System.out.println("2. Tambah data di akhir");
//            System.out.println("3. Tambah data pada node tertentu");
//            System.out.println("4. Hapus data di awal");
//            System.out.println("5. Hapus data di akhir");
//            System.out.println("6. Hapus data pada node tertentu");
//            System.out.println("7. Cari data");
//            System.out.println("8. Keluar");
//            System.out.print("Masukkan pilihan: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Masukkan data: ");
//                    String dataAtBeginning = scannerString.nextLine();
//                    list.insertAtBeginning(dataAtBeginning);
//                    break;
//                case 2:
//                    System.out.print("Masukkan data: ");
//                    String dataAtEnd = scannerString.nextLine();
//                    list.insertAtEnd(dataAtEnd);
//                    break;
//                case 3:
//                    System.out.print("Masukkan data: ");
//                    String dataAtPosition = scannerString.nextLine();
//                    System.out.print("Masukkan posisi: ");
//                    int position = scannerString.nextInt();
//                    list.insertAtPosition(dataAtPosition, position);
//                    break;
//                case 4:
//                    list.deleteAtBeginning();
//                    break;
//                case 5:
//                    list.deleteAtEnd();
//                    break;
//                case 6:
//                    System.out.print("Masukkan posisi: ");
//                    int deletePosition = scannerString.nextInt();
//                    list.deleteAtPosition(deletePosition);
//                    break;
//                case 7:
//                    System.out.print("Masukkan data yang dicari: ");
//                    String searchKey = scannerString.nextLine();
//                    list.search(searchKey);
//                    break;
//                case 8:
//                    System.out.println("Keluar dari program.");
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
//            }
//
//            list.display(); // Menampilkan isi linked list setelah setiap operasi
//
//        } while (choice != 8);
//
//        scannerString.close();
//    }
//}
//
//
////public class LinkedList {
////        static Node head;
////
////        public static String search(String key){
////            Node current = head;
////            int position = 1;
////
////            while (current != null){
////                if (current.data == key){
////                    return position + " "+key;
////                }
////                position++;
////            }
////            return "data tidak di temukan";
////        }
////
////    public static void main(String[] args) {
////        Node data = new Node();
////        data.data = "sandika";
////
//////        head.data = "dika";
////        System.out.println(search("sandika"));
////    }
////
////}
